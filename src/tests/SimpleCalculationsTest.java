package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calculation.*;

public class SimpleCalculationsTest {
	private Calculator c;

	@Before
	public void init() {
		c = new Calculator();
	}

	@Test
	public void testAddition() {
		assertEquals(4, c.whatOperation("2+2").result());
		assertNotEquals(1, c.whatOperation("2+2").result());
	}

	@Test
	public void testSoustract() {
		assertEquals(2, c.whatOperation("52-50").result());
		assertNotEquals(5, c.whatOperation("2-1").result());
	}

	@Test
	public void testMultiplication() {
		assertEquals(4, c.whatOperation("2*2").result());
		assertNotEquals(1, c.whatOperation("5*5").result());
	}

	@Test
	public void testDivision() {
		assertEquals(1, c.whatOperation("2/2").result());
		assertNotEquals(5, c.whatOperation("9/3").result());
	}

}
