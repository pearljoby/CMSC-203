/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: In this project it tests the persons ESP (extrasensory perception). This is a game where the user have to
 guess the color that the computer has picked. 
 * Due: 02/05/23
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Pearl Joby
*/


package pJoby_Assignment1_ESP;

import java.util.Scanner;

public class ESP {
	
	// color assignments 
	final static String COLOR_RED = "Red";
	final static String COLOR_ORANGE = "Orange";
	final static String COLOR_YELLOW = "Yellow";
	final static String COLOR_GREEN = "Green";
	final static String COLOR_BLUE = "Blue";
	final static String COLOR_PURPLE = "Purple";
	final static String COLOR_PINK= "Pink";
	
	
	private static String getColorName(int randomNumber) {
        switch (randomNumber) {
            case 0:
                return COLOR_RED;
            case 1:
                return COLOR_ORANGE;
            case 2:
                return COLOR_YELLOW;
            case 3:
                return COLOR_GREEN;
            case 4:
                return COLOR_BLUE;
            case 5:
            	return COLOR_PURPLE;
            case 6: 
            	return COLOR_PINK;
            default:
                return "";
        }
    }
	
	
	private static boolean isValidColor(String guess) {
        return guess.equalsIgnoreCase(COLOR_RED) ||
        		guess.equalsIgnoreCase(COLOR_ORANGE) ||
        		guess.equalsIgnoreCase(COLOR_YELLOW) ||
        		guess.equalsIgnoreCase(COLOR_GREEN) ||
        		guess.equalsIgnoreCase(COLOR_BLUE) ||
        		guess.equalsIgnoreCase(COLOR_PURPLE) ||
        		guess.equalsIgnoreCase(COLOR_PINK);
        
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to the ESP (extrasensory perception) Game!"); 
		System.out.println("Please Enter your name: "); 
		String name = sc.nextLine();
		
		System.out.println("Please Describe your self: ");
		String Userdescription = sc.nextLine();
		
		System.out.println("Please Enter your M number:  ");
		String Mnumber = sc.nextLine();
		
		System.out.println("Enter the due date of this project in MM/DD/YY format: ");
		String due = sc.nextLine();
		
		System.out.println("CMSC203 Assignment 1: Test your ESP skills!");
		
		
		//Test
		int correctGuess = 0 ; 
		
		for (int round = 1; round <=11; round++) {
			System.out.println("Round " + round);
			System.out.println("\nI am thinking of a color.\n Is it " + COLOR_RED + ", " + COLOR_ORANGE + ", " + COLOR_YELLOW + ", "
			+ COLOR_GREEN + ", " + COLOR_BLUE + ", " + COLOR_PURPLE +", " + COLOR_PINK);
			
			System.out.print("Enter your guess:"); 
			String guess = sc.nextLine();
			
			while (!isValidColor(guess)) {
				System.out.println("You entered incorrect color. Is it "  + COLOR_RED + ", " + COLOR_ORANGE + ", " + COLOR_YELLOW + ", "
						+ COLOR_GREEN + ", " + COLOR_BLUE + ", " + COLOR_PURPLE + ", " + COLOR_PINK);
				System.out.print("Enter your guess again: ");
				guess= sc.nextLine();
				
			}
			
			int randomNumber =(int)(Math.random()*6);
			
			String selectedColor = getColorName(randomNumber);
			
			System.out.println("I was thinking of " + selectedColor + ".");
			
			if(guess.equalsIgnoreCase(selectedColor)) {
				System.out.println("Your guess is Correct!"); 
				correctGuess++;
			} else {
				System.out.println("Your guess is wrong!"); 
				
			}
			
			
		}
		
		System.out.println("Game Over!"); 
		
		System.out.println("You Guessed : " + correctGuess + " rounds of the 11 rounds correctly");
		System.out.println("Student Name : " + name);
		System.out.println("M number: " + Mnumber);
		System.out.println("User Description: " + Userdescription);
		System.out.println("Due Date: " + due); 
		System.out.println("Programmer Name: Pearl Joby"); 
		
		sc.close();
			
			
			
		}
	
    
    
   
}

 