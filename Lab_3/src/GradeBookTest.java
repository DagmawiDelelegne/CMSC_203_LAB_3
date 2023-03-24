import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GradeBookTest {
		private static GradeBook gb;
		private static GradeBook gb2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		gb = new GradeBook(5);
		gb2 = new GradeBook(5);
		
		
	      gb.addScore(85.5);
	      gb.addScore(92.0);

	      // Add some random scores to book2
	      gb2.addScore(78.5);
	      gb2.addScore(89.0);
	      gb2.addScore(95.5);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		gb = null;
		gb2 = null;
		
	}

	@Test
	void testAddScore() {
		assertTrue(gb.toString().equals("85.5 92.0"));
		assertEquals(2, gb.getScoreSize());
		
		assertTrue(gb2.toString().equals("78.5 89.0 95.5"));
		assertEquals(3, gb2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(gb.sum(), 177.5);
		assertEquals(gb2.sum(), 263);
	}

	@Test
	void testMinimum() {
		assertEquals(gb.minimum(),85.5);
		assertEquals(gb2.minimum(),78.5);
	}

	@Test
	void testFinalScore() {
		assertEquals(gb.finalScore(),92.0);
		assertEquals(gb2.finalScore(),184.5);
	}

	
	

}
