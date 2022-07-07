package mod9.shopping;

import java.util.ArrayList;

public class OrderManager {

	private ArrayList<Product> products;

	public OrderManager() {
		products = new ArrayList<Product>();
	}

	public void add(Product p) {
		this.products.add(p);
	}

	public int getNumberOfProducts() {
		return this.products.size();
	}

}
