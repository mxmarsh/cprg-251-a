package mod9.shopping;

import mod9.exceptions.InvalidPriceException;

/**
 * Class description:
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Product {

	private String name;
	private int quantity;
	private double price;

	public Product(String name, int quantity, double price) throws InvalidPriceException {
		if (price < 0)
			throw new InvalidPriceException();

		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

}
