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
import org.junit.Before;

	public class CustomerTestStudent {

	    Customer c1,c2;
		@Before
		public void setUp() throws Exception {
			 c1 = new Customer("name1", 10);
		 
		}

		@After
		public void tearDown() throws Exception {
			
			c1=null;
		}

		@Test
		public void testConstructor() {
			
			Customer c2  = new Customer(c1);
			
			assertFalse(c1 == c2);
			c2.setName("name2");
			c2.setAge(20);
			assertFalse(c2.getName().equals(c1.getName()));
			assertFalse(c2.getAge() == c1.getAge());
			 
		}

		 
			


	}