
public class Rectangle {

	// fields:
	private double width;
	private double height;

	// constructor methods:

	public Rectangle() {
		System.out.println("Creating a rectangle...");
	}

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
