import java.util.ArrayList;
import java.util.List;
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

public class BevShop implements BevShopInterface {
    private List<Order> orders;

    // Constructor
    public BevShop() {
        this.orders = new ArrayList<>();
    }

    // Implementation of BevShopInterface methods

    @Override
    public boolean isValidTime(int time) {
        return time >= MIN_TIME && time <= MAX_TIME;
    }

    @Override
    public int getMaxNumOfFruits() {
        return MAX_FRUIT;
    }

    @Override
    public int getMinAgeForAlcohol() {
        return MIN_AGE_FOR_ALCOHOL;
    }

    @Override
    public boolean isMaxFruit(int numOfFruits) {
        return numOfFruits > MAX_FRUIT;
    }

    @Override
    public int getMaxOrderForAlcohol() {
        return MAX_ORDER_FOR_ALCOHOL;
    }

    @Override
    public boolean isEligibleForMore() {
        return getNumOfAlcoholDrink() < MAX_ORDER_FOR_ALCOHOL;
    }

    @Override
    public int getNumOfAlcoholDrink() {
        if (!orders.isEmpty()) {
            return orders.get(orders.size() - 1).findNumOfBeveType(Type.ALCOHOL);
        }
        return 0;
    }

    @Override
    public boolean isValidAge(int age) {
        return age >= MIN_AGE_FOR_ALCOHOL;
    }

    @Override
    public void startNewOrder(int orderNumber, Day day, String customerName, int customerAge) {
       Customer customer = new Customer (customerName, customerAge);
       Order newOrder = new Order ();
    }

    @Override
    public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        if (!orders.isEmpty()) {
            orders.get(orders.size() - 1).addNewBeverage(bevName, size, extraShot, extraSyrup);
        }
    }

    @Override
    public void processAlcoholOrder(String bevName, Size size) {
        if (!orders.isEmpty()) {
            orders.get(orders.size() - 1).addNewBeverage(bevName, size);
        }
    }

    @Override
    public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
        if (!orders.isEmpty()) {
            orders.get(orders.size() - 1).addNewBeverage(bevName, size, numOfFruits, addProtein);
        }
    }

    @Override
    public int findOrder(int orderNo) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber1() == orderNo) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public double totalOrderPrice(int orderNo) {
        int index = findOrder(orderNo);
        if (index != -1) {
            return orders.get(index).calcOrderTotal();
        }
        return 0.0;
    }

    @Override
    public double totalMonthlySale() {
        double totalSale = 0.0;
        for (Order order : orders) {
            totalSale += order.calcOrderTotal();
        }
        return totalSale;
    }

    @Override
    public int totalNumOfMonthlyOrders() {
        return orders.size();
    }

    @Override
    public Order getCurrentOrder() {
        if (!orders.isEmpty()) {
            return orders.get(orders.size() - 1);
        }
        return null;
    }

    @Override
    public Order getOrderAtIndex(int index) {
        if (index >= 0 && index < orders.size()) {
            return orders.get(index);
        }
        return null;
    }

    @Override
    public void sortOrders() {
    }
}