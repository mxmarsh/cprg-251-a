package mod3;

/**
 * Class description: Represents the Shape superclass.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Shape {

	// fields:
	private String color;

	public Shape() {
		System.out.println("Running the Shape constructor...");
	}

	public Shape(String color) {
		this.color = color;
		System.out.println("Running the Shape constructor...");
	}

	/**
	 * Getter method for color
	 * 
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Setter method for color
	 * 
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

}
