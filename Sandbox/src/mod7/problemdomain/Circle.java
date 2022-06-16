package mod7.problemdomain;

import mod7.exceptions.InvalidRadiusException;

/**
 * Class description: Represents a Circle.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Circle {

	// fields:
	private double radius; // radius of the circle

	// constructor:
	public Circle(double radius) throws InvalidRadiusException {
		if (radius < 0)
			throw new InvalidRadiusException();

		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI * radius * radius;
	}

}
