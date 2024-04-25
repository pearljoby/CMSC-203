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

public class Coffee extends Beverage {

	private boolean extraShotCoffee;
	private boolean extraShotSyrup;
	private final double COFFEE_SHOT = 0.50;
	private final double EXTRA_SYRUP = 0.50;

	public Coffee(String name, Type type, Size size, boolean extraShotCoffee, boolean extraShotSyrup) {
		super(name, type, size);
		this.extraShotCoffee = extraShotCoffee;
		this.extraShotSyrup = extraShotSyrup;
	}
	
	public Coffee(String name, Size size, boolean extraShotCoffee, boolean extraShotSyrup) {
		super(name, size);
		this.extraShotCoffee = extraShotCoffee;
		this.extraShotSyrup = extraShotSyrup;
	}

	public boolean getExtraShot() {
		return extraShotCoffee;
	}

	public void setExtraShot(boolean extraShotCoffee) {
		this.extraShotCoffee = extraShotCoffee;
	}

	public boolean getExtraSyrup() {
		return extraShotSyrup;
	}

	public void setExtraSyrup(boolean extraShotSyrup) {
		this.extraShotSyrup = extraShotSyrup;
	}

	@Override
	/**
	 * Calculates and returns the beverage price.
	 * 
	 * @return price
	 */
	public double calcPrice() {

		double price = 0;

		if (getSize().equals(Size.SMALL)) {

			if (getExtraShot() == true)
				price = getBasePrice() + COFFEE_SHOT;
			else if (getExtraSyrup() == true)
				price = getBasePrice() + EXTRA_SYRUP;
			else if (getExtraShot() == true && getExtraSyrup() == true)
				price = getBasePrice() + EXTRA_SYRUP + EXTRA_SYRUP;
			else
				price = getBasePrice();

		} else if (getSize().equals(Size.MEDIUM)) {

			if (getExtraShot() == true)
				price = (getBasePrice() + COFFEE_SHOT) + (getSIZE_PRICE() * 2);
			else if (getExtraSyrup() == true)
				price = (getBasePrice() + EXTRA_SYRUP) + (getSIZE_PRICE() * 2);
			else if (getExtraShot() == true && getExtraSyrup() == true)
				price = (getBasePrice() + COFFEE_SHOT + EXTRA_SYRUP) * (getSIZE_PRICE() * 2);
			else
				price = getBasePrice() * (getSIZE_PRICE() * 2);

		} else if (getSize().equals(Size.LARGE)) {
			if (getExtraShot() == true)
				price = (getBasePrice() + COFFEE_SHOT) + (getSIZE_PRICE() * 3);
			else if (getExtraSyrup() == true)
				price = (getBasePrice() + EXTRA_SYRUP) + (getSIZE_PRICE() * 3);
			else if (getExtraShot() == true && getExtraSyrup() == true)
				price = (getBasePrice() + COFFEE_SHOT + EXTRA_SYRUP) + (getSIZE_PRICE() * 3);
			else
				price = getBasePrice() * (getSIZE_PRICE() * 3);
		}

		return price;
	}

	@Override
	/**
	 * checks equality based on name, type, size of the beverage
	 * 
	 * @param bevName
	 * @param bevType
	 * @param bevSize
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
	 * Print Coffee details including the name and size
	 */
	public String toString() {

		String str = "Name: " + getBevName() + "\nSize: " + getSize() + "\nExtra Coffee Shot: " + getExtraShot()
				+ " Extra Syrup Shot:  " + getExtraSyrup() + "\nPrice: " + calcPrice();
		return str;
	}

}