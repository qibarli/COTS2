package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class TallyTest {

	@Test
	public void testReset() {
		Tally testTally = new Tally();
		
		for(int i = 0; i <10; i++) {
			testTally.add();
		}
		
		testTally.initialize();
		
		assertEquals(testTally.getTotal(), 0);
	}

	@Test
	public void testadd() {
		Tally testTally = new Tally();
		
		for(int i = 1; i <10; i++) {
			testTally.add();
			assertEquals(testTally.getTotal(), i);
		}
	}

	@Test
	public void testsubtract() {
		Tally testTally = new Tally();
		
		for(int i = 1; i <10; i++) {
			testTally.subtract();
			assertEquals(testTally.getTotal(), i * -1);
		}
	}

}
