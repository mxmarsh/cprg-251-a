package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

import mod9.calculator.OurCalculator;

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

	// come up with at least one test for each of the remaining methods
	// then, write the missing code
	// re-run the test
	// don't worry about testing exception

}
