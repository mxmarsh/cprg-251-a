package mod9.shopping;

import mod9.exceptions.*;

/**
 * Class description: represents a product in a shopping cart
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Product {

	private String name;
	private int quantity;
	private double price;

	public Product(String name, int quantity, double price) throws InvalidPriceException, InvalidQuantityException {
		if (price < 0)
			throw new InvalidPriceException();

		if (quantity <= 0)
			throw new InvalidQuantityException();

		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public double getPrice() {
		return this.price;
	}

}
