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


public class DayTestStudent {

    @Test
    public void testEnumConstants() {
        // Test all enum constants
        assertEquals(Day.MONDAY, Day.valueOf("MONDAY"));
        assertEquals(Day.TUESDAY, Day.valueOf("TUESDAY"));
        assertEquals(Day.WEDNESDAY, Day.valueOf("WEDNESDAY"));
        assertEquals(Day.THURSDAY, Day.valueOf("THURSDAY"));
        assertEquals(Day.FRIDAY, Day.valueOf("FRIDAY"));
        assertEquals(Day.SATURDAY, Day.valueOf("SATURDAY"));
        assertEquals(Day.SUNDAY, Day.valueOf("SUNDAY"));
    }

    @Test
    public void testEnumValues() {
        // Test enum values array
        Day[] days = Day.values();
        assertEquals(7, days.length); // Ensure there are 7 constants in the enum

        // Validate each constant's ordinal value
        assertEquals(0, Day.MONDAY.ordinal());
        assertEquals(1, Day.TUESDAY.ordinal());
        assertEquals(2, Day.WEDNESDAY.ordinal());
        assertEquals(3, Day.THURSDAY.ordinal());
        assertEquals(4, Day.FRIDAY.ordinal());
        assertEquals(5, Day.SATURDAY.ordinal());
        assertEquals(6, Day.SUNDAY.ordinal());
    }
}