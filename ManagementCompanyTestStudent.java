import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestStudent {
	Property sampleProperty;
	ManagementCompany mangementCo ; 
	
	@Before
	public void setUp() throws Exception {
		mangementCo= new ManagementCompany("Pearl Housing", "274532904",7);
	}

	@After
	public void tearDown() throws Exception {
		mangementCo=null;
	}

	@Test
	public void testAddProperty() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);		 
		assertEquals(mangementCo.addProperty(sampleProperty),-3,0);
	}
	
	@Test
	public void testGetPropertiesCount() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);		 
		assertEquals(mangementCo.addProperty(sampleProperty),-3,0);	
		assertEquals(mangementCo.getPropertiesCount(), 0);
	}

	@Test
    public void testToString() {
    sampleProperty = new Property("Sunsational", "Beckman", 2613.0, "BillyBob Wilson", 2, 2, 2, 2);
    int index = mangementCo.addProperty(sampleProperty);
    if (index == -3) {
        System.out.println("Property not added: plot does not encompass the plot of the management company.");
    } else {
        String expectedString = "List of the properties for Railey, taxID: 555555555\n"
                + "______________________________________________________\n"
                + "Sunsational,Beckman,BillyBob Wilson,2613.0\n"
                + "______________________________________________________\n"
                + "\n"
                + " total management Fee: 156.78";
        System.out.println(expectedString);
        System.out.println(mangementCo.toString());
        assertEquals(expectedString, mangementCo.toString());
    }
}
}