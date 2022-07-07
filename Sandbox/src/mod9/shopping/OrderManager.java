package mod9.shopping;

import java.util.ArrayList;

/**
 * 
 * Class description: represents a shopping cart containing Product objects
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */
public class OrderManager {

	private ArrayList<Product> products;
	public static final double GST_RATE = 0.05;

	public OrderManager() {
		products = new ArrayList<Product>();
	}

	public void add(Product p) {
		this.products.add(p);
	}

	public int getNumberOfProducts() {
		return this.products.size();
	}

	public boolean isEmpty() {
		if (this.products.size() == 0)
			return true;
		else
			return false;
	}

	public double calculateSubtotal() {
		double subtotal = 0;
		for (Product p : products) {
			subtotal += p.getQuantity() * p.getPrice();
		}
		return subtotal;
	}

	public double calculateTotal() {

		// subtotal + 5% of the subtotal
		// == subtotal * 1 + subtotal * 5%
		// == subtotal * (1 + 5%)

		return calculateSubtotal() * (1 + GST_RATE);
	}

	public boolean contains(Product product) {

		if (product == null)
			throw new NullPointerException();

		for (Product p : products) {
			if (p.getName().equals(product.getName())) {
				return true;
			}
		}
		return false;

	}

}
