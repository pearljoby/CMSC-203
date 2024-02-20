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
public class Procedure {

	private String procedureName; 
	private String procedureDate; 
	private String practitionerName; 
	private double procedureCharges;

// no arg constructor
public Procedure () {
	
}

// constructor for procedure name and date
public Procedure (String procedureName, String procedureDate) {
	this.procedureName = procedureName; 
	this.procedureDate = procedureDate; 
}

public Procedure (String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
	this.procedureName = procedureName; 
	this.procedureDate = procedureDate;
	this.practitionerName = practitionerName; 
	this.procedureCharges = procedureCharges;
}
 //Accessors
public String getProcedureName() {
    return procedureName;
}

public String getProcedureDate() {
    return procedureDate;
}

public String getPractitionerName() {
    return practitionerName;
}

public double getProcedureCharges() {
    return procedureCharges;
}

//Mutators 
public void setProcedureName(String procedureName) {
    this.procedureName = procedureName;
}

public void setProcedureDate(String procedureDate) {
    this.procedureDate = procedureDate;
}

public void setPractitionerName(String practitionerName) {
    this.practitionerName = practitionerName;
}

public void setProcedureCharges(double procedureCharges) {
    this.procedureCharges = procedureCharges;
}
//toString method

public String toString() {
    return "Procedure Information:\n" +
           "Name: " + procedureName + "\n" +
           "Date: " + procedureDate + "\n" +
           "Practitioner: " + practitionerName + "\n" +
           "Charges: $" + procedureCharges;
}

}

