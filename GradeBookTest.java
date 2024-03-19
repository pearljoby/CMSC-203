import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTest {
	private GradeBook gradebook1;
	private GradeBook gradebook2;
	
	@BeforeEach
	void setUp() throws Exception {
		
// this creates the gradebook object which can hold 4 scores 
		gradebook1 = new GradeBook(5);
		gradebook2 = new GradeBook(5);
		
// this adds scores to the gradebook 
		 gradebook1.addScore(70.0);
	     gradebook1.addScore(55.0);

	     gradebook2.addScore(75.0);
	     gradebook2.addScore(60.0);
	     gradebook2.addScore(97.0);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		gradebook1 = null; 
		gradebook2 = null;
	}

	@Test
	void testAddScore() {
		
		String expectedScores1 = "70.0 55.0";
        assertEquals(expectedScores1, gradebook1.toString());
        assertEquals (2, gradebook1.getScoreSize());
        
        String expectedScores2 = "75.0 60.0 97.0";
        assertEquals(expectedScores2, gradebook2.toString());
        assertEquals (3, gradebook2.getScoreSize());
	}

	@Test
	void testSum() {
		double expectedSum1 = 70.0 + 55.0;
		double expectedSum2 = 75.0 + 60.0 + 97.0;
		
		assertEquals(expectedSum1,gradebook1.sum(),0.001 );
		assertEquals (expectedSum2, gradebook2.sum(),0.001);
		
	}

	@Test
	void testMinimum() {
		double expectedMinimum1 = 55.0;
		double expectedMinimum2 = 60.0;
		
		assertEquals(expectedMinimum1,gradebook1.minimum(),0.001 );
		assertEquals(expectedMinimum2, gradebook2.minimum(),0.001);
		
	}

	@Test
	void testFinalScore() {
		double expectedFinalScore1 = 70.0;
		double expectedFinalScore2 = 172.0;
		
		assertEquals(expectedFinalScore1, gradebook1.finalScore(),0.001);
		assertEquals( expectedFinalScore2, gradebook2.finalScore(),0.001);
	}

	
}
