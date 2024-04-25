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

public class Smoothie extends Beverage {
	private int numOfFruits;
	private boolean addProtein;
	private final double PROTEIN_COST = 1.50;
	private final double EXTRA_FRUIT = 0.50;

	public Smoothie(String name, Type type, Size size, int numOfFruits, boolean addProtein) {
		super(name, type, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	public Smoothie(String name, Size size, int numOfFruits, boolean addProtein) {
		super(name, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}


	public int getNumOfFruits() {
		return numOfFruits;
	}

	public void setNumOfFruits(int numOfFruits) {
		this.numOfFruits = numOfFruits;
	}

	public boolean getAddProtien() {
		return addProtein;
	}

	public void setAddProtein(boolean addProtein) {
		this.addProtein = addProtein;
	}

	@Override
	public double calcPrice() {

		double price = 0;

		if (getSize().equals(Size.SMALL)) {

			if (getAddProtien() == true && getNumOfFruits() > 1)
				price = getBasePrice() + PROTEIN_COST + (numOfFruits - 1 * EXTRA_FRUIT);
			else if (getAddProtien() == true && getNumOfFruits() == 1)
				price = getBasePrice() + PROTEIN_COST;
			else if (getAddProtien() == false && getNumOfFruits() > 1)
				price = getBasePrice() + (numOfFruits - 1 * EXTRA_FRUIT);
			else
				price = getBasePrice();

		} else if (getSize().equals(Size.MEDIUM)) {
			if (getAddProtien() == true && getNumOfFruits() > 1)
				price = getBasePrice() + PROTEIN_COST + (numOfFruits - 1 * EXTRA_FRUIT) + (getSIZE_PRICE() * 2);
			else if (getAddProtien() == true && getNumOfFruits() == 1)
				price = getBasePrice() + PROTEIN_COST + (getSIZE_PRICE() * 2);
			else if (getAddProtien() == false && getNumOfFruits() > 1)
				price = getBasePrice() + (numOfFruits - 1 * EXTRA_FRUIT) + (getSIZE_PRICE() * 2);
			else
				price = getBasePrice() + (getSIZE_PRICE() * 2);

		} else if (getSize().equals(Size.LARGE)) {

			if (getAddProtien() == true && getNumOfFruits() > 1)
				price = getBasePrice() + PROTEIN_COST + (numOfFruits - 1 * EXTRA_FRUIT) + (getSIZE_PRICE() * 3);
			else if (getAddProtien() == true && getNumOfFruits() == 1)
				price = getBasePrice() + PROTEIN_COST + (getSIZE_PRICE() * 3);
			else if (getAddProtien() == false && getNumOfFruits() > 1)
				price = getBasePrice() + (numOfFruits - 1 * EXTRA_FRUIT) + (getSIZE_PRICE() * 3);
			else
				price = getBasePrice() + (getSIZE_PRICE() * 3);

		}

		return price;
	}

	@Override
	/**
	 * checks equality based on name, type, size of the beverage
	 * 
	 * @param myName
	 * @param myType
	 * @param mySize
	 * @return true or false
	 */
	public boolean equals(String bevName, Type bevType, Size bevSize) {

		boolean compare = false;

		if (getBevName().equals(bevName) && getType().equals(bevType) && getSize().equals(bevSize))
			compare = true;

		return compare;
	}

	@Override
	/**
	 * print Smmothie details including the name and size
	 */
	public String toString() {

		String str = "Name: " + getBevName() + "\nSize: " + getSize() + "\nExtra Protein: " + getAddProtien()
				+ "\nNumber of Fruits:  " + getNumOfFruits() + "\nPrice: " + calcPrice();
		return str;
	}

}