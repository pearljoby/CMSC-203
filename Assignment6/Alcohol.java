/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek 
 * Platform/compiler:
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: 
*/
public class Alcohol extends Beverage {
	private boolean offeredWeekend;
	private final double WEEKEND_BEV_COST = 0.60;
	private Size Size;

	// constructors
	public Alcohol(String name, Size size) {
		super(name, Type.ALCOHOL, size);
		this.Size = size;
	}
	public Alcohol(String name, Size size, boolean offeredWeekend) {
		super(name, size);
		this.offeredWeekend = offeredWeekend;
	}

	/**
	 * checks whether alcohol is offered on weekends
	 * 
	 * @return
	 */
	public boolean isOfferedWeekend() {
		return offeredWeekend;
	}

	/**
	 * Sets the value of weekend
	 * 
	 * @param offeredWeekend
	 */
	public void setOfferedWeekend(boolean offeredWeekend) {
		this.offeredWeekend = offeredWeekend;
	}

	@Override
	/**
	 * Calculates the price of alcohol
	 */
	public double calcPrice() {
		double getbasePrize = 2.0;
		double weekendBevCost = 0.6;
		double sizePriceMultiplier = 1.3;
		
		double price = getBasePrice(); 

		if (getSize() == Size.SMALL) {
			if (isOfferedWeekend()) {
				price +=  weekendBevCost;
			}
			
		} else if (getSize() == Size.MEDIUM) {
	        price += sizePriceMultiplier * 2; // Adjust price based on size
	        if (isOfferedWeekend()) {
	            price += weekendBevCost;
	        }
	    } else if (getSize() == Size.LARGE) {
	        price += sizePriceMultiplier * 3; // Adjust price based on size
	        if (isOfferedWeekend()) {
	            price += weekendBevCost;
	        }
	    }

	    return price;
	}

	@Override
	/**
	 * checks equality based on name, type, size of the beverage
	 * 
	 * @param bevName name of beverage
	 * @param bevType type of beverage
	 * @param bevSize size of beverage
	 * @return true or false
	 */
	public boolean equals(String bevName, Type bevType, Size bevSize) {

		boolean compare = false;

		if (getName().equals(bevName) && getType().equals(bevType) && getSize().equals(bevSize))
			compare = true;

		return compare;
	}

	@Override
	/**
	 * print Alcohol details including the name and size
	 */
	public String toString() {

		String str = "Name: " + getName() + "\nSize: " + getSize() + "\nOffered of Weekend: " + isOfferedWeekend()
				+ "\nPrice: " + calcPrice();
		return str;
	}
}
