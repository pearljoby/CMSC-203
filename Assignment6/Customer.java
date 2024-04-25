import org.junit.Test; 
import static org.junit.Assert.*;
/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek 
 * Platform/compiler:
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Pearl Joby
*/

public class Customer {
	private String name; // name of customer
	private int age; // age of customer

	/**
	 * Customer Constructor
	 * 
	 * @param name
	 * @param age
	 */
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Deep copy
	 * 
	 * @param newCustomer
	 */
	public Customer(Customer newCustomer) {
		this.name = newCustomer.name;
		this.age = newCustomer.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	/**
	 * Print customer age and name
	 */
	public String toString() {
		String str = "Customer Name: " + getName() + " Age: " + getAge();
		return str;
	}

}