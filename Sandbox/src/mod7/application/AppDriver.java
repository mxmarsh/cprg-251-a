package mod7.application;

import java.util.Scanner;

import mod7.exceptions.InvalidRadiusException;
import mod7.problemdomain.Circle;

public class AppDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// prompt the user for a radius
		System.out.print("Please enter the radius: ");
		double radius = keyboard.nextDouble();

		// build a Circle of the specified radius
		Circle circle;
		try {
			circle = new Circle(radius);
			System.out.println("The surface area of the Circle is " + circle.calculateArea());
		} catch (InvalidRadiusException e) {
			System.out.println(e.getMessage());
		} finally {
			keyboard.close();
		}

	}

}
