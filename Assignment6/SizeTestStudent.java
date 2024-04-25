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


public class SizeTestStudent {

    @Test
    public void testEnumConstants() {
        // Test all enum constants
        assertEquals(Size.SMALL, Size.valueOf("SMALL"));
        assertEquals(Size.MEDIUM, Size.valueOf("MEDIUM"));
        assertEquals(Size.LARGE, Size.valueOf("LARGE"));
    }

    @Test
    public void testEnumValues() {
        // Test enum values array
        Size[] sizes = Size.values();
        assertEquals(3, sizes.length); // Ensure there are 3 constants in the enum

        // Validate each constant's ordinal value
        assertEquals(0, Size.SMALL.ordinal());
        assertEquals(1, Size.MEDIUM.ordinal());
        assertEquals(2, Size.LARGE.ordinal());
    }
}