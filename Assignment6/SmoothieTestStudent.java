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
import org.junit.Test; 
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

public class SmoothieTestStudent {

	Smoothie s1,s2,s3,s4;
	@Before
	public void setUp() throws Exception {
		s1 = new  Smoothie ("s1Name", Size.SMALL, 1,false );
		s2 = new  Smoothie ("s2NAme", Size.MEDIUM, 2,true );
		s3 = new  Smoothie ("s3NAme", Size.LARGE, 3, true );
		s4 = new  Smoothie ("s4NAme", Size.SMALL, 4, false );
		
	}

	@After
	public void tearDown() throws Exception {
		s1=s2=s3=s4=null;
	}
	
	@Test
	public void testGetBasePrice()
	{
		assertEquals(2.0,s1.getBasePrice(), .01);
		assertEquals(2.0,s2.getBasePrice(), .01);
		assertEquals(2,s3.getBasePrice(), .01);
		assertEquals(2,s4.getBasePrice(), .01);
	}
 
	@Test
	public void testCalPrice() {
		
		assertEquals(2.0,s1.calcPrice(), .01 );
		assertEquals(7.0,s2.calcPrice(), .01 );
		assertEquals(9.0,s3.calcPrice(), .01 );
		assertEquals(5.5,s4.calcPrice(), .01 );
		 
	}
	@Test
	public void testToString() {
		
		assertTrue(s1.toString().contains(s1.getBevName()));
		assertTrue(s1.toString().contains(String.valueOf(s1.calcPrice()) ));
		assertTrue(s1.toString().contains(s1.getSize().toString() ));
		assertTrue(s1.toString().contains( String.valueOf(s1.getNumOfFruits()) ));
  
	}
}