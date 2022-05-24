package mod3;

/**
 * Class description: Represents a Rectangle object.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Rectangle extends Shape {

	// fields:
	private double width;
	private double height;

	// methods:

	public Rectangle() {
		System.out.println("Running the Rectangle constructor...");
	}

	public Rectangle(String color) {
		super(color);
		System.out.println("Running the Rectangle constructor...");
	}

	/**
	 * Getter method for width
	 * 
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Getter method for height
	 * 
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	public double getArea() {
		return width * height;
	}

}
