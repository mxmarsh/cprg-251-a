/**
 * 
 * @author Dana Marsh (dana.marsh@sait.ca)
 * @author Musqunamu'k (moral support)
 * @version May 17, 2022
 *
 */
public class Rectangle {

	// fields:
	/**
	 * This represents the width of the Rectangle.
	 */
	private double width;
	private double height;

	// constructor methods:
	/**
	 * No-arg constructor.
	 */
	public Rectangle() {
		System.out.println("Creating a rectangle...");
	}

	/**
	 * This constructor creates a Rectangle of a specified width and height.
	 * 
	 * @param w
	 *            The width of the Rectangle object
	 * @param h
	 *            The height of the Rectangle object
	 */
	public Rectangle(double w, double h) {
		this.width = w; // this. is optional here
		this.height = h; // this. is optional here
	}

	// get/set methods:
	public void setWidth(double w) {
		width = w;
	}

	public void setHeight(double h) {
		height = h;
	}

	/**
	 * This method returns the width of the Rectangle.
	 * 
	 * @return The width of the Rectangle
	 */
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getParimeter() {
		return 2 * (width + height);
	}

	public double getArea() {
		return width * height;
	}

}
