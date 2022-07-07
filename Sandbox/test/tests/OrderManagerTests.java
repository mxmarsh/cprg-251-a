package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import mod9.exceptions.InvalidPriceException;
import mod9.shopping.*;

class OrderManagerTests {

	private OrderManager order;

	@BeforeEach
	void setUp() throws Exception {
		order = new OrderManager();
	}

	@AfterEach
	void tearDown() throws Exception {
		order = null;
	}

	@Test
	public void testAdd() {
		try {
			// create a new product
			Product p = new Product("apples", 2, .50);
			// add that product to the order
			order.add(p);
			// check that the order has one product in it
			int expected = 1;
			int actual = order.getNumberOfProducts();
			assertEquals(expected, actual);
		} catch (InvalidPriceException ex) {
			fail("InvalidPriceException should not have been thrown.");
		}

	}

	@Test
	public void testAddInvalidPrice() {
		assertThrows(InvalidPriceException.class, () -> {
			// create a product with a negative price
			Product p = new Product("apples", 2, -.50);
			// add that product to the order
			order.add(p);
		});
	}

	@Test
	public void testAddInvalidQuantity() {

		// expect to see InvalidQuantityException

	}

	// check if the order is empty

	// get the size of the order

	// test:
	// calculate subtotal
	// 2 apples @ 50 cents each
	// 3 bananas @ $1
	// subtotal = $4

	// calculate total: subtotal + 5% GST

	// check if a certain product is in the order

}
