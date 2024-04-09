import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PropertyTestStudent {
    Property propertyOne;
    Property propertyTwo;
    Property propertyThree;

    @Before
    public void setUp() throws Exception {
        propertyOne = new Property("First House", "Miami", 2100.00, "Property Lister", 1, 2, 3, 3);
        propertyTwo = new Property("Second House", "Boston", 1900.00, "Property Lister", 5, 4, 3, 3);
        propertyThree = new Property("Third House", "New York City", 1800.00, "Property Lister", 9, 4, 3, 3);
    }

    @After
    public void tearDown() throws Exception {
        propertyOne = null;
        propertyTwo = null;
        propertyThree = null;
    }

    @Test
    public void testGetPropertyName() {
        assertEquals("First House", propertyOne.getPropertyName());
        assertEquals("Second House", propertyTwo.getPropertyName());
        assertEquals("Third House", propertyThree.getPropertyName());
    }

    @Test
    public void testGetRentAmount() {
        assertEquals(2100.0, propertyOne.getRentAmount(), 0.0);
        assertEquals(1900.0, propertyTwo.getRentAmount(), 0.0);
        assertEquals(1800.0, propertyThree.getRentAmount(), 0.0);
    }

    @Test
    public void testGetPlot() {
        assertEquals(1, propertyOne.getPlot().getX());
        assertEquals(2, propertyOne.getPlot().getY());
        assertEquals(3, propertyOne.getPlot().getWidth());
        assertEquals(3, propertyOne.getPlot().getDepth());

        assertEquals(5, propertyTwo.getPlot().getX());
        assertEquals(4, propertyTwo.getPlot().getY());
        assertEquals(3, propertyTwo.getPlot().getWidth());
        assertEquals(3, propertyTwo.getPlot().getDepth());

        assertEquals(9, propertyThree.getPlot().getX());
        assertEquals(4, propertyThree.getPlot().getY());
        assertEquals(3, propertyThree.getPlot().getWidth());
        assertEquals(3, propertyThree.getPlot().getDepth());
    }

    @Test
    public void testToString() {
        assertEquals("First House,Miami,Property Lister,2100.0", propertyOne.toString());
        assertEquals("Second House,Boston,Property Lister,1900.0", propertyTwo.toString());
        assertEquals("Third House,New York City,Property Lister,1800.0", propertyThree.toString());
    }
}