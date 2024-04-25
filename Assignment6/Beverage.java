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

public abstract class Beverage {

	private String name;
	private Type type;
	private Size size;
	private final double BASE_PRICE = 2.0;
	private final double SIZE_PRICE = 1;

	/**
	 * Beverage constructor
	 * 
	 * @param name
	 * @param type
	 * @param size
	 */
	public Beverage(String name, Type type, Size size) {
		this.setName(name);
		this.type = type;
		this.size = size;
	}
	public Beverage(String name, Size size) {
		this.setName(name);
		this.size = size;
	}

	public Beverage(Beverage drinks) {
		this.setName(drinks.getName());
		this.type = drinks.type;
		this.size = drinks.size;
	}

	// METHODS

	public String getBevName() {
		return getName();
	}

	public void setBevName(String name) {
		this.setName(name);
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public double getBasePrice() {
		return BASE_PRICE;
	}

	public double getSIZE_PRICE() {
		return SIZE_PRICE;
	}

	/**
	 * this calculates and returns the beverage price.
	 * 
	 * @return
	 */
	public abstract double calcPrice();

	/**
	 * checks equality based on name, type, size of the beverage
	 * 
	 * @param bevName
	 * @param bevType
	 * @param bevSize
	 * @return true or false
	 */
	public abstract boolean equals(String bevName, Type bevType, Size bevSize);

	/**
	 * String representation for Beverage including the name and size
	 */
	public abstract String toString();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}