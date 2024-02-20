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
public class Patient {
	private String firstName; 
	private String middleName; 
	private String lastName;
	private String streetAddress; 
	private String city; 
	private String state; 
	private String ZIPCode; 
	private String phoneNumber; 
	private String emergencyContactName; 
	private String emergencyContactPhone;
 
// no arg constructor 
public Patient() {
	
}

// Parameterized constructor for first, middle and last name
public Patient(String firstName, String middleName, String lastName) {
	this.firstName = firstName; 
	this.middleName = middleName;
	this.lastName = lastName; 
	
}

// Parameterized constructor for all the attributes
public Patient (String firstName,String middleName, String lastName, String streetAddress, String city, String state,
		String ZIPCode, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
	this.firstName = firstName; 
	this.middleName = middleName; 
	this.lastName = lastName;
	this.streetAddress = streetAddress; 
	this.city = city; 
	this.state = state; 
	this.ZIPCode = ZIPCode;
	this.phoneNumber = phoneNumber; 
	this.emergencyContactName = emergencyContactName; 
	this.emergencyContactPhone = emergencyContactPhone; 
}

// Accessors for each of the atributes
public String getFirstName() {
    return firstName;
}

public String getMiddleName() {
    return middleName;
}

public String getLastName() {
    return lastName;
}

public String getStreetAddress() {
    return streetAddress;
}

public String getCity() {
    return city;
}

public String getState() {
    return state;
}

public String getZIPCode() {
    return ZIPCode;
}

public String getEmergencyContactName() {
    return emergencyContactName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getPhoneNumber() {
    return phoneNumber;
}

public String getEmergencyContactPhone() {
    return emergencyContactPhone;
}


// Mutator for each attribute 
public void setMiddleName(String middleName) {
    this.middleName = middleName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
}

public void setCity(String city) {
    this.city = city;
}


public void setState(String state) {
    this.state = state;
}



public void setZipCode(String ZIPCode) {
    this.ZIPCode = ZIPCode;
}

public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}

public void setEmergencyContactName(String emergencyContactName) {
    this.emergencyContactName = emergencyContactName;
}

public void setEmergencyContactPhone(String emergencyContactPhone) {
    this.emergencyContactPhone = emergencyContactPhone;
}



// Build Full name Method
public String buildFullName() {
	 return firstName + " " + middleName + " " + lastName;
}

//Build Address Method
public String buildAddress() {
	return streetAddress + ", " + city + ", " + state + " " + ZIPCode;
}

//Build Emergency Contact Method 
public String buildEmergencyContact() {
	return emergencyContactName + " " + emergencyContactPhone;
}

// toString method

public String toString() {
    return "Patient Information : \n" + "Full Name : " +buildFullName() + "\n" + "Address : " + buildAddress() + "\n" + "Phone Number : " + "\n" + " Emergency Contact : " + buildEmergencyContact();
    		
}
}
