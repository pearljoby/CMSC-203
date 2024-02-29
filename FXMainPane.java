import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class FXMainPane extends VBox {

	private Button helloButton, howdyButton, chineseButton, clearButton, exitButton, languageButton;
	private Label feedback;
	private TextField textField;
	private HBox buttonBox, inputBox;
	private DataManager dataManager;
	
	FXMainPane() {
		instantiateComponents();
		layoutComponents();
		setupButtonActions();
		
	}
	
	private void instantiateComponents() {
		helloButton = new Button ("Hello");
		howdyButton = new Button ("Howdy");
		chineseButton = new Button ("Chinese"); 
		clearButton = new Button ("Clear");
		exitButton = new Button ("Exit");
		
		languageButton = new Button ("Hello in another language");
		
		feedback = new Label ("Feedback: ");
		textField = new TextField();
		
		buttonBox = new HBox(10,helloButton, howdyButton, chineseButton, clearButton, exitButton, languageButton);
		inputBox = new HBox( 10, feedback, textField );
		
		dataManager = new DataManager();
		
		 VBox.setMargin(inputBox, new Insets(10));
	        VBox.setMargin(buttonBox, new Insets(10));
	        buttonBox.setAlignment(Pos.CENTER);
	        inputBox.setAlignment(Pos.CENTER);
		
	}
	
		private void layoutComponents() {
			
			getChildren().addAll(buttonBox, inputBox);
			setAlignment(Pos.CENTER); 
			setSpacing(20);
	}
	
		private void setupButtonActions() {
			 class ButtonHandler implements EventHandler<ActionEvent> {
		            @Override
		            public void handle(ActionEvent event) {
		                if (event.getSource() == helloButton) {
		                    textField.setText(dataManager.getHello());
		                } else if (event.getSource() == howdyButton) {
		                    textField.setText(dataManager.getHowdy());
		                } else if (event.getSource() == chineseButton) {
		                    textField.setText(dataManager.getChinese());
		                } else if (event.getSource() == clearButton) {
		                    textField.setText("");
		                } else if (event.getSource() == exitButton) {
		                    Platform.exit();
		                    System.exit(0);
		                } else if (event.getSource() == languageButton) {
		                    // Optional: Handle the new language button
		                    textField.setText(dataManager.getAnotherLanguage());
		                }
		            }
		          
		         
		        }
			 helloButton.setOnAction(new ButtonHandler());
		        howdyButton.setOnAction(new ButtonHandler());
		        chineseButton.setOnAction(new ButtonHandler());
		        clearButton.setOnAction(new ButtonHandler());
		        exitButton.setOnAction(new ButtonHandler());
		        languageButton.setOnAction(new ButtonHandler());
		    }
		}

 