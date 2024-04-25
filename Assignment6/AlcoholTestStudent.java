import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlcoholTestStudent {
	Alcohol a1, a2, a3, a4;

	@Before
	public void setUp() throws Exception {
		a1 = new Alcohol("Vodka", Size.SMALL, false);
		a2 = new Alcohol("Whiskey", Size.MEDIUM, true);
		a3 = new Alcohol("Rum", Size.LARGE, false);
		a4 = new Alcohol("Tequila", Size.SMALL, true);

	}

	@After
	public void tearDown() throws Exception {
		a1 = a2 = a3 = a4 = null;
	}

	@Test
	public void testGetBasePrice() {
		assertEquals(2.0, a1.getBasePrice(), .01);
		assertEquals(2.0, a2.getBasePrice(), .01);
		assertEquals(2.0, a3.getBasePrice(), .01);
		assertEquals(2.0, a4.getBasePrice(), .01);
	}

	@Test
	public void testCalPrice() {

		assertEquals(2.0, a1.calcPrice(), 0.01);
		assertEquals(5.19, a2.calcPrice(), 0.01);
		assertEquals(5.9, a3.calcPrice(), 0.01);
		assertEquals(2.6, a4.calcPrice(), 0.01);
	}

	@Test
	public void testToString() {

		assertTrue(a1.toString().contains(a1.getBevName()));
		assertTrue(a1.toString().contains(String.valueOf(a1.calcPrice())));
		assertTrue(a1.toString().contains(a1.getSize().toString()));

	}

}