import java.util.Scanner;
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

public class BevShopDriverApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a beverage shop instance
        BevShop beverageShop = new BevShop();

        System.out.println("The current order in process can have at most 3 alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is 21");

        // Start a new order
        System.out.println("Would you please start a new order:");
        System.out.print("Your Total Order for now is 0.0\n");
        System.out.print("Would you please enter your name: ");
        String customerName = scanner.nextLine();
        System.out.print("Would you please enter your age: ");
        int customerAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Check age eligibility
        if (customerAge >= BevShop.MIN_AGE_FOR_ALCOHOL) {
            System.out.println("Your age is above 21 and you are eligible to order alcohol");
        } else {
            System.out.println("Your age is below 21 and you are not eligible to order alcohol");
        }

        // Start a new order for the customer
        beverageShop.startNewOrder(12, Day.MONDAY, customerName, customerAge);
        System.out.printf("The Total Price on the Order: %.1f\n", beverageShop.getCurrentOrder().calcOrderTotal());

        // Add alcoholic beverages
        for (int i = 0; i < BevShop.MAX_ORDER_FOR_ALCOHOL; i++) {
            System.out.println("Would you please add an alcohol drink:");
            beverageShop.processAlcoholOrder("Wine", Size.SMALL);
            System.out.printf("The current order of drinks is %d\n", beverageShop.getNumOfAlcoholDrink());
            System.out.printf("The Total Price on the Order: %.1f\n", beverageShop.getCurrentOrder().calcOrderTotal());
            if (!beverageShop.isEligibleForMore()) {
                System.out.println("You have reached the maximum alcohol drinks for this order.");
                break;
            }
        }

        // Add a coffee to the order
        System.out.println("Would you please add a COFFEE to your order:");
        beverageShop.processCoffeeOrder("Espresso", Size.MEDIUM, true, false);
        System.out.printf("Total items on your order is %d\n", beverageShop.getCurrentOrder().getBeverages().size());
        System.out.printf("The Total Price on the Order: %.1f\n", beverageShop.getCurrentOrder().calcOrderTotal());

        System.out.println("#------------------------------------#");

        // Start a new order for another customer
        System.out.println("Would you please start a new order:");
        System.out.print("Would you please enter your name: ");
        customerName = scanner.nextLine();
        System.out.print("Would you please enter your age: ");
        customerAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Start a new order for the new customer
        beverageShop.startNewOrder(15, Day.THURSDAY, customerName, customerAge);
        System.out.printf("The Total Price on the Order: %.1f\n", beverageShop.getCurrentOrder().calcOrderTotal());

        // Add smoothies and coffee to the new order
        System.out.println("Would you please add a SMOOTHIE to order:");
        beverageShop.processSmoothieOrder("Berry Blast", Size.LARGE, 5, true);
        System.out.printf("The Total Price on the Order: %.1f\n", beverageShop.getCurrentOrder().calcOrderTotal());

        System.out.println("Would you please add a SMOOTHIE to order:");
        beverageShop.processSmoothieOrder("Mango Madness", Size.MEDIUM, 2, false);
        System.out.printf("The Total Price on the Order: %.1f\n", beverageShop.getCurrentOrder().calcOrderTotal());

        System.out.println("Would you please add a COFFEE to order:");
        beverageShop.processCoffeeOrder("Cappuccino", Size.SMALL, false, true);
        System.out.printf("The Total Price on the Order: %.1f\n", beverageShop.getCurrentOrder().calcOrderTotal());

        System.out.println("Would you please add a drink:");
        beverageShop.processCoffeeOrder("Americano", Size.LARGE, false, false);
        System.out.printf("The Total price on the Order: %.1f\n", beverageShop.getCurrentOrder().calcOrderTotal());

        System.out.printf("Total price on the second Order: %.1f\n", beverageShop.getOrderAtIndex(1).calcOrderTotal());
        System.out.printf("Total amount for all Orders: %.1f\n", beverageShop.totalMonthlySale());

        scanner.close();
    }
}