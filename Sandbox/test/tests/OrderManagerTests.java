package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import mod9.exceptions.*;
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
		} catch (InvalidQuantityException ex) {
			fail("InvalidQuantityException should not have been thrown.");
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
		assertThrows(InvalidQuantityException.class, () -> {
			// create product with decimals
			Product p = new Product("Apples", -2, 0.50);
			// add product to the order
			order.add(p);
		});
	}

	@Test
	public void testIsEmpty() {
		// create an empty order
		// confirm that isEmpty() returns true
		assertTrue(order.isEmpty());
	}

	@Test
	public void testIsNotEmpty() {
		try {
			// create an order with products in it
			order.add(new Product("apples", 17, .50));
			// confirm that isEmpty() returns false
			assertFalse(order.isEmpty());
		} catch (Exception ex) {
			fail("Should not have thrown an exception.");
		}
	}

	@Test
	public void testGetNumberOfProducts() {
		// empty order
		assertEquals(0, order.getNumberOfProducts());
	}

	@Test
	public void testCalculateSubtotal() {
		try {
			// 2 apples @ 50 cents each
			order.add(new Product("apples", 2, .50));
			// 3 bananas @ $1
			order.add(new Product("bananas", 3, 1.00));
			// subtotal = $4
			assertEquals(4, order.calculateSubtotal(), .01);
		} catch (Exception ex) {
			fail("Should not have thrown an exception.");
		}
	}

	@Test
	public void testCalculateTotal() {
		try {
			// 2 apples @ 50 cents each
			order.add(new Product("apples", 2, .50));
			// 3 bananas @ $1
			order.add(new Product("bananas", 3, 1.00));
			// subtotal = $4
			// tax = .20
			// total = $4.20
			assertEquals(4.20, order.calculateTotal(), .01);
		} catch (Exception ex) {
			fail("Should not have thrown an exception.");
		}
	}

	@Test
	public void testContains() {
		try {
			order.add(new Product("apples", 2, .50));
			order.add(new Product("bananas", 3, 1.00));
			assertTrue(order.contains(new Product("apples", 5, .75)));
		} catch (Exception ex) {
			fail("Should not have thrown an exception.");
		}
	}

	@Test
	public void testNotContains() {
		try {
			order.add(new Product("apples", 2, .50));
			order.add(new Product("bananas", 3, 1.00));
			assertFalse(order.contains(new Product("pears", 5, .75)));
		} catch (Exception ex) {
			fail("Should not have thrown an exception.");
		}
	}

	@Test
	public void testContainsNull() {
		try {
			order.add(new Product("apples", 2, .50));
			order.add(new Product("bananas", 3, 1.00));
			order.contains(null);
			fail("Should have thrown an exception.");
		} catch (NullPointerException ex) {
			assertTrue(true);
		} catch (Exception ex) {
			fail("Should have thrown an NPE.");
		}
	}

}
