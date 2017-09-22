package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calculation.*;

/** It's a Test class who tests the calculation of one operation. */
public class SimpleCalculationsTest {
	private Calculator c;

	/** Initialize the Calculator. */
	@Before
	public void init() {
		c = new Calculator();
	}

	/** Test the addition. */
	@Test
	public void testAddition() {
		assertEquals(4, c.whatOperation("2+2").result());
		assertNotEquals(1, c.whatOperation("2+2").result());
	}

	/** Test the substraction. */
	@Test
	public void testSoustract() {
		assertEquals(2, c.whatOperation("52-50").result());
		assertNotEquals(5, c.whatOperation("2-1").result());
	}

	/** Test the multiplication. */
	@Test
	public void testMultiplication() {
		assertEquals(4, c.whatOperation("2*2").result());
		assertNotEquals(1, c.whatOperation("5*5").result());
	}

	/** Test the division. */
	@Test
	public void testDivision() {
		assertEquals(1, c.whatOperation("2/2").result());
		assertNotEquals(5, c.whatOperation("9/3").result());
	}

}
