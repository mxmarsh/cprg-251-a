/**
 * This class represents a Rectangle object.
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
	/**
	 * This represents the height of the Rectangle.
	 */
	private double height;

	// constructor methods:
	/**
	 * Initializes the newly created Rectangle
	 */
	public Rectangle() {
		System.out.println("Creating a rectangle...");
	}

	/**
	 * This constructor creates a Rectangle of a specified width and height.
	 * 
	 * @param w The width of the Rectangle object
	 * @param h The height of the Rectangle object
	 */
	public Rectangle(double w, double h) {
		this.width = w; // this. is optional here
		this.height = h; // this. is optional here
	}

	// get/set methods:
	/**
	 * Sets the Rectangle's width.
	 * 
	 * @param w Width of Rectangle
	 */
	public void setWidth(double w) {
		width = w;
	}

	/**
	 * Sets the Rectangle's height.
	 * 
	 * @param h Height of Rectangle
	 */
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

	/**
	 * This method returns the height of the Rectangle.
	 * 
	 * @return The height of the Rectangle.
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * This method returns the perimeter of the Rectangle.
	 * 
	 * @return Perimeter of the Rectangle
	 */
	public double getParimeter() {
		return 2 * (width + height);
	}

	/**
	 * This method returns the area of the Rectangle.
	 * 
	 * @return Area of rectangle.
	 */
	public double getArea() {
		return width * height;
	}

}
