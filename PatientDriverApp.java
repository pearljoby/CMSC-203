/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: This project is to make a patient information chart. The concepts that are used in this are Java Classes and objects
 * Due: 02/19/24
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Pearl Joby
*/


public class PatientDriverApp {
    public static void main(String[] args) {
        // Create a Patient 
    	Patient patient = new Patient("Pearl","Ponnu", "Joby", "12630 Horseshoe bend Circle", "Clarksburg", "Maryland", "20871", "571-324-0105", "Emergency Contact: Joby Sebastian", "571-598-9096");

        // Create three Procedure instances using different constructors
        Procedure procedure1 = new Procedure("Blood Test", "01/15/2023");
        Procedure procedure2 = new Procedure("Abdominal Scanning", "02/20/2023", "Dr. Thomas", 150.0);
        Procedure procedure3 = new Procedure("MRI", "03/25/2023", "Dr. Patel", 300.0);

        // Display patient information
        displayPatient(patient);

        // Display information about the three procedures
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display total charges of the three procedures
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
     
        System.out.println("Total Charges for Three Procedures: $" + String.format("%.2f", totalCharges));
        
        System.out.println("The program was developed by a Student: Pearl Joby on 02/19/24>");
    }

    // Method to display patient information
    public static void displayPatient(Patient patient) {
       
        System.out.println(patient);
        System.out.println("----------------------------");
    }

    // Method to display procedure information
    public static void displayProcedure(Procedure procedure) {
       
        System.out.println(procedure);
        System.out.println("----------------------------");
    }

    // Method to calculate total charges of three procedures
    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getProcedureCharges() + procedure2.getProcedureCharges() + procedure3.getProcedureCharges();
    }
    
   
}


