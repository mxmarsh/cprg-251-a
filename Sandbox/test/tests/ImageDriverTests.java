package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

class ImageDriverTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		// add 1 + 3
		int actual = 1 + 3;
		// expect the answer to be 4
		int expected = 4;

		// assertion to compare expected vs actual:
		assertEquals(actual, expected);
	}

}
