package mod3;

/**
 * Class description: Represents a Circle.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Circle extends Shape {

	private double radius;

	/**
	 * Initializes the newly created Circle
	 */
	public Circle() {
	}

	/**
	 * Initializes the newly created Circle
	 * 
	 * @param color
	 */
	public Circle(String color) {
		super(color);
	}

	/**
	 * Getter method for radius
	 * 
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Setter method for radius
	 * 
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

}
