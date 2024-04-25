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


public class TypeTestStudent {

    @Test
    public void testEnumConstants() {
        // Test all enum constants
        assertEquals(Type.COFFEE, Type.valueOf("COFFEE"));
        assertEquals(Type.SMOOTHIE, Type.valueOf("SMOOTHIE"));
        assertEquals(Type.ALCOHOL, Type.valueOf("ALCOHOL"));
    }

    @Test
    public void testEnumValues() {
        // Test enum values array
        Type[] types = Type.values();
        assertEquals(3, types.length); // Ensure there are 3 constants in the enum

        // Validate each constant's ordinal value
        assertEquals(0, Type.COFFEE.ordinal());
        assertEquals(1, Type.SMOOTHIE.ordinal());
        assertEquals(2, Type.ALCOHOL.ordinal());
    }
}