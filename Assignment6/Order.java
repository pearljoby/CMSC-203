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
import java.util.ArrayList;
import java.util.List;

public class Order implements OrderInterface {
    private List<Beverage> beverages;

    // Constructor
    public Order() {
        this.beverages = new ArrayList<>();
    }

    // Implementation of OrderInterface methods

    @Override
    public boolean isWeekend() {
        // Assume Sunday is Day 0 and Saturday is Day 6
        Day currentDay = Day.values()[(int) (System.currentTimeMillis() / (24 * 60 * 60 * 1000)) % 7];
        return currentDay == Day.SATURDAY || currentDay == Day.SUNDAY;
    }

    @Override
    public Beverage getBeverage(int itemNo) {
        if (itemNo >= 0 && itemNo < beverages.size()) {
            return beverages.get(itemNo); // Return a shallow copy of the beverage
        }
        return null;
    }

    @Override
    public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        Beverage beverage = new Coffee(bevName, size, extraShot, extraSyrup);
        beverages.add(beverage);
    }

    @Override
    public void addNewBeverage(String bevName, Size size) {
        Beverage beverage = new Alcohol(bevName, size, false);
        beverages.add(beverage);
    }

    @Override
    public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
        Beverage beverage = new Smoothie(bevName, size, numOfFruits, addProtein);
        beverages.add(beverage);
    }

    @Override
    public double calcOrderTotal() {
        double totalAmount = 0.0;
        for (Beverage beverage : beverages) {
            totalAmount += beverage.calcPrice();
        }
        return totalAmount;
    }

    @Override
    public int findNumOfBeveType(Type type) {
        int count = 0;
        for (Beverage beverage : beverages) {
            if (beverage.getType() == type) {
                count++;
            }
        }
        return count;
    }

    // Getter for the list of beverages in this order
    public List<Beverage> getBeverages() {
        return beverages;
    }

	@Override
	public Beverage getBeverage1(int coffee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Beverage getBeverage(Beverage coffee) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getOrderNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void startOrder1(int time, Day day, String customerName, int customerAge) {
		// TODO Auto-generated method stub
		
	}



	public int getOrderNumber1() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void startOrder(int time, Day day, String customerName, int customerAge) {
		// TODO Auto-generated method stub
		
	}

	public int getTotalItems() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getCustomerName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getDay() {
		return null;
	}
}