package lab6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {


	public int capacity = 0;



	GradeBook g1;
	GradeBook g2;



	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(40);
		g1.addScore(50);
		g1.addScore(60);
		g1.addScore(70);
		g2.addScore(11);
		g2.addScore(7);
		g2.addScore(0);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
		
	}


	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("40.0 50.0 60.0 70.0 0.0 "));
		assertEquals(4, g1.getScoreSize());
		assertTrue(g2.toString().equals("11.0 7.0 0.0 0.0 0.0 "));
		assertEquals(3, g2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(220, g1.sum());
		assertEquals(18, g2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(40, g1.minimum());
		assertEquals(0, g2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(180, g1.sum()-g1.minimum());
		assertEquals(18, g2.sum()-g2.minimum());
	}

}
