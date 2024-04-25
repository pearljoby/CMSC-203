import org.junit.Before;
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

import org.junit.After;

public class BevShopTestStudent {

	BevShop bevShop;
	@Before
	public void setUp() throws Exception {
		bevShop = new BevShop();
	}

	@After
	public void tearDown() throws Exception {
		bevShop = null;
	}

	@Test
	public void testValidTime()
	{
		assertTrue(bevShop.isValidTime(8));
		assertTrue(bevShop.isValidTime(23));
		assertFalse(bevShop.isValidTime(7));
		assertFalse(bevShop.isValidTime(24));
	}
	 
	@Test
	public void testValidAge()
	{
		assertFalse(bevShop.isValidAge(21));
		assertTrue(bevShop.isValidAge(27));
	}
	
	@Test
	public void testStartNewOrder(){
		bevShop.startNewOrder(8,Day.MONDAY,"John", 30);
		
		Order currentOrder = bevShop.getCurrentOrder();
		assertNotNull(currentOrder);
		
		assertEquals(8, bevShop.getCurrentOrder().getOrderNumber());
		assertEquals(Day.MONDAY, bevShop.getCurrentOrder().getDay());
		
		Customer customer = (Customer) currentOrder.getCustomerName();
		assertNotNull(customer);
		
		assertEquals("John", ((Beverage) bevShop.getCurrentOrder().getCustomerName()).getName());
		assertEquals(30, ( (Customer) bevShop.getCurrentOrder().getCustomerName()).getAge());
		
		assertEquals(0, bevShop.getNumOfAlcoholDrink());
		assertEquals(0, bevShop.getCurrentOrder().getTotalItems());
	}
	
	@Test
	public void testProcessAlcoholOrder()
	{
		bevShop.startNewOrder(8,Day.MONDAY,"John", 30);
		
		bevShop.processAlcoholOrder("Mohito", Size.LARGE);
		assertTrue(bevShop.getCurrentOrder().getTotalItems() == 1);
		assertTrue(bevShop.getCurrentOrder().getBeverage(0).getBevName().equals("Mohito"));
		assertTrue(bevShop.getCurrentOrder().getBeverage(0).getSize().equals(Size.LARGE));
		assertTrue(bevShop.getCurrentOrder().getBeverage(0).getType().equals(Type.ALCOHOL));	
		assertTrue(bevShop.isEligibleForMore());
		bevShop.processAlcoholOrder("tonic", Size.MEDIUM);
		assertTrue(bevShop.getCurrentOrder().getTotalItems() == 2);
		assertTrue(bevShop.getCurrentOrder().getBeverage(1).getBevName().equals("tonic"));
		assertTrue(bevShop.getCurrentOrder().getBeverage(1).getSize().equals(Size.MEDIUM));
		assertTrue(bevShop.getCurrentOrder().getBeverage(1).getType().equals(Type.ALCOHOL));	
		assertTrue(bevShop.isEligibleForMore());
		bevShop.processAlcoholOrder("Vodka", Size.SMALL);
		assertTrue(bevShop.getCurrentOrder().getTotalItems() == 3);
		assertTrue(bevShop.getCurrentOrder().getBeverage(2).getBevName().equals("Vodka"));
		assertTrue(bevShop.getCurrentOrder().getBeverage(2).getSize().equals(Size.SMALL));
		assertTrue(bevShop.getCurrentOrder().getBeverage(2).getType().equals(Type.ALCOHOL));	
		assertEquals(1,bevShop.totalNumOfMonthlyOrders());
		
	}
	
	@Test
	public void testProcessSmoothieOrder()
	{
		bevShop.startNewOrder(8,Day.MONDAY,"John", 30);
		assertTrue ( bevShop.isMaxFruit(6) );
		assertFalse ( bevShop.isMaxFruit(5) );
		bevShop.processSmoothieOrder("Detox", Size.SMALL, 1, false);
		assertTrue(bevShop.getCurrentOrder().getTotalItems() == 1);
		
		Smoothie sm = (Smoothie) bevShop.getCurrentOrder().getBeverage(0);
		
		assertTrue(bevShop.getCurrentOrder().getBeverage(0).getBevName().equals("Detox"));
		assertTrue(bevShop.getCurrentOrder().getBeverage(0).getSize().equals(Size.SMALL));
		assertTrue(bevShop.getCurrentOrder().getBeverage(0).getType().equals(Type.SMOOTHIE));
		
		
		assertTrue(sm.getNumOfFruits() == 1);
		assertFalse(sm.getAddProtien());
		 
		
		bevShop.processSmoothieOrder("Morning SunShine", Size.LARGE, 4, true);
		assertTrue(bevShop.getCurrentOrder().getTotalItems() == 2);
		
		sm =  (Smoothie) bevShop.getCurrentOrder().getBeverage(1);
		assertTrue(bevShop.getCurrentOrder().getBeverage(1).getBevName().equals("Morning SunShine"));
		assertTrue(bevShop.getCurrentOrder().getBeverage(1).getSize().equals(Size.LARGE));
		assertTrue(bevShop.getCurrentOrder().getBeverage(1).getType().equals(Type.SMOOTHIE));
		
		assertTrue(sm.getNumOfFruits() == 4);
		assertTrue(sm.getAddProtien());
		assertEquals(1,bevShop.totalNumOfMonthlyOrders());
		
	}
	
	@Test
	public void testProcessCoffeeOrder()
	{
		Coffee cf;
		bevShop.startNewOrder(8,Day.MONDAY,"Kate", 20);
		bevShop.processCoffeeOrder("americano", Size.SMALL, true, false);
		assertTrue(bevShop.getCurrentOrder().getTotalItems() == 1);
		
		cf = (Coffee) bevShop.getCurrentOrder().getBeverage(0);
		assertTrue(bevShop.getCurrentOrder().getBeverage(0).getBevName().equals("americano"));
		assertTrue(bevShop.getCurrentOrder().getBeverage(0).getSize().equals(Size.SMALL));
		assertTrue(bevShop.getCurrentOrder().getBeverage(0).getType().equals(Type.COFFEE));
		assertTrue(cf.getExtraShot()); 
		assertFalse(cf.getExtraSyrup()); 
		
		bevShop.processCoffeeOrder("Cappuccino", Size.LARGE, false, false);
		cf = (Coffee) bevShop.getCurrentOrder().getBeverage(1);
		
		assertTrue(bevShop.getCurrentOrder().getTotalItems() == 2);
		
		assertTrue(bevShop.getCurrentOrder().getBeverage(1).getBevName().equals("Cappuccino"));
		assertTrue(bevShop.getCurrentOrder().getBeverage(1).getSize().equals(Size.LARGE));
		assertTrue(bevShop.getCurrentOrder().getBeverage(1).getType().equals(Type.COFFEE));
		assertFalse(cf.getExtraShot()); 
		assertFalse(cf.getExtraSyrup()); 
		
	}
	
	@Test
	public void testFindOrder()
	{
	 
		int orderNum;
		bevShop.startNewOrder(8,Day.MONDAY,"Kate", 20);
		bevShop.processCoffeeOrder("americano", Size.SMALL, true, false);
		bevShop.processCoffeeOrder("Cappuccino", Size.LARGE, false, false);
		bevShop.processSmoothieOrder("Morning SunShine", Size.LARGE, 4, true);
		
		orderNum = bevShop.getCurrentOrder().getOrderNumber();
		
		bevShop.startNewOrder(8, Day.SUNDAY, "John", 30);
		bevShop.processSmoothieOrder("Detox", Size.SMALL, 1, false);
		
		// Test findOrder method
		assertEquals(0, bevShop.findOrder(orderNum)); // Should find the order at index 0
		
		orderNum = bevShop.getCurrentOrder().getOrderNumber();
		assertEquals(1, bevShop.findOrder(orderNum)); // Should find the order at index 1
	}
	
	@Test
	public void testTotalOrderPrice()
	{
	 	int orderNum1, orderNum2;
		
		bevShop.startNewOrder(8, Day.MONDAY, "Kate", 20);
		bevShop.processCoffeeOrder("americano", Size.SMALL, true, false); 
		bevShop.processCoffeeOrder("Cappuccino", Size.LARGE, false, false);
		bevShop.processCoffeeOrder("Latte", Size.LARGE, true, true);
		
		orderNum1 = bevShop.getCurrentOrder().getOrderNumber();
		
		bevShop.startNewOrder(8, Day.SUNDAY, "John", 30);
		bevShop.processSmoothieOrder("Detox", Size.SMALL, 1, false);
	
		orderNum2 = bevShop.getCurrentOrder().getOrderNumber();
	 
		assertEquals(11.5, bevShop.totalOrderPrice(orderNum1), 0.01);
		assertEquals(2.5, bevShop.totalOrderPrice(orderNum2), 0.01);
	}
	
	@Test
	public void testTotalMonthlySale()
	{
		bevShop.startNewOrder(8, Day.MONDAY, "Kate", 20);
		bevShop.processCoffeeOrder("americano", Size.SMALL, true, false); 
		bevShop.processCoffeeOrder("Cappuccino", Size.LARGE, false, false);
		bevShop.processCoffeeOrder("Latte", Size.LARGE, true, true);
	
		bevShop.startNewOrder(8, Day.SUNDAY, "John", 30);
		bevShop.processSmoothieOrder("Detox", Size.SMALL, 1, false);
		bevShop.processAlcoholOrder("Mohito", Size.SMALL);
		
		bevShop.startNewOrder(12, Day.SATURDAY, "Amy", 43);
		bevShop.processSmoothieOrder("Detox", Size.MEDIUM, 4, true);
		bevShop.processCoffeeOrder("Latte", Size.SMALL, false, false);		 

	 
		assertEquals(0.0, bevShop.totalMonthlySale(), 0.01);
	}
	
	@Test
	public void testSortOrders()
	{
		bevShop.startNewOrder(8, Day.MONDAY, "Kate", 20);
		bevShop.startNewOrder(8, Day.SUNDAY, "John", 30);
		bevShop.startNewOrder(12, Day.SATURDAY, "Amy", 43);
		
		bevShop.sortOrders();
		Order order1 = bevShop.getOrderAtIndex(0);
	    Order order2 = bevShop.getOrderAtIndex(1);
	    Order order3 = bevShop.getOrderAtIndex(2);

	    assertNotNull("First order is null",order1);
	    assertNotNull("Second order is null",order2);
	    assertNotNull("Third order is null",order3);
	    
	    System.out.println("First order: " + order1.getOrderNumber());
	    System.out.println("Second order: " + order2.getOrderNumber());
	    System.out.println("Third order: " + order3.getOrderNumber());
	    
	    assertTrue("Order 1 should be less than Order 2", order1.getOrderNumber() < order2.getOrderNumber());
	    assertTrue("Order 2 should be less than Order 3", order2.getOrderNumber() < order3.getOrderNumber());
	}
	
	@Test
	public void testToString() {
		
		bevShop.startNewOrder(8, Day.MONDAY, "Kate", 20);
		bevShop.processCoffeeOrder("americano", Size.SMALL, true, false); 
		bevShop.processCoffeeOrder("Cappuccino", Size.LARGE, false, false);
		 
	
		bevShop.startNewOrder(8, Day.SUNDAY, "John", 30);
		bevShop.processSmoothieOrder("Detox", Size.SMALL, 1, false);
			  
		 
		assertTrue(bevShop.toString().contains(String.valueOf(bevShop.getOrderAtIndex(0).getOrderNumber())));
		assertTrue(bevShop.toString().contains(((Beverage) bevShop.getOrderAtIndex(0).getCustomerName()).getName()));
		assertTrue(bevShop.toString().contains(bevShop.getOrderAtIndex(0).getBeverage(0).getSize().toString()));
		assertTrue(bevShop.toString().contains(bevShop.getOrderAtIndex(0).getBeverage(0).getBevName()));
		
		assertTrue(bevShop.toString().contains(String.valueOf(bevShop.getOrderAtIndex(1).getOrderNumber())));
		assertTrue(bevShop.toString().contains(((Beverage) bevShop.getOrderAtIndex(1).getCustomerName()).getName()));
		assertTrue(bevShop.toString().contains(bevShop.getOrderAtIndex(1).getBeverage(0).getSize().toString()));
		assertTrue(bevShop.toString().contains(bevShop.getOrderAtIndex(1).getBeverage(0).getBevName()));
		
		assertTrue(bevShop.toString().contains(String.valueOf(bevShop.totalMonthlySale())));
	}
}