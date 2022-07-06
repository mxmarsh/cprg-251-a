package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import mod9.calculator.OurCalculator;
import mod9.exceptions.NegativeSquareRootException;

class OurCalculatorTests {

	private OurCalculator calc;
	private double value1;
	private double value2;

	@BeforeEach
	void setUp() throws Exception {
		calc = new OurCalculator();
		value1 = 1.3;
		value2 = 5.7;
	}

	@AfterEach
	void tearDown() throws Exception {
		calc = null;
		value1 = 0;
		value2 = 0;
	}

	@Test
	public void testAdd() {
		// add 1.3 and 5.7
		double actual = calc.add(value1, value2);
		// expect the sum to be 7
		double expected = 7;

		assertEquals(actual, expected, .001);
	}

	@Test
	public void testAdd2() {
		double actual = calc.add(0, value2);
		double expected = 5.7;

		assertEquals(actual, expected, .001);
	}

	@Test
	public void testSubtract() {
		double actual = calc.subtract(value1, value2);
		double expected = -4.4;
		assertEquals(actual, expected, .001);
	}

	@Test
	public void testMultiply() {
		double actual = calc.multiply(value1, value2);
		double expected = 7.41;
		assertEquals(actual, expected, .001);
	}

	@Test
	public void testDivide() {
		double actual = calc.divide(value1, value2);
		double expected = 0.228;
		assertEquals(actual, expected, .001);
	}

	@Test
	public void sillyTest() {
		assertThrows(Exception.class, () -> {
			Integer.parseInt("abc");
		});
	}

	@Test
	public void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> {
			calc.divide(value1, 0);
		});
	}

	@Test
	public void testSquare() {
		double actual = calc.square(value1);
		double expected = 1.69;
		assertEquals(actual, expected, 0.001);
	}

	@Test
	public void testSquareRootPositive() {
		double actual;
		try {
			actual = calc.squareRoot(value1);
			double expected = 1.14;
			assertEquals(actual, expected, .001);
		} catch (NegativeSquareRootException e) {
			// this is a failure
			fail("This operation should not throw an exception.");
		}
	}

	@Test
	public void testSquareRootNegative() {
		try {
			calc.squareRoot(-value1);
			// if the previous line doesn't throw an exception, we continue here
			fail("Should have thrown an exception.");
		} catch (NegativeSquareRootException e) {
			// this is what I expect to happen
			assertTrue(true);
		}
	}

	@Test
	public void testSquareRootNegativeV2() {
		assertThrows(NegativeSquareRootException.class, () -> {
			calc.squareRoot(-value1);
		});
	}

}
