package mod1;

import java.util.Scanner;

import mod1.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is your name?");
		String userName = keyboard.nextLine();

		System.out.println("Nice to meet you, " + userName + ". What is the height of your Rectangle?");
		int height = keyboard.nextInt();

		System.out.println("What is its width?");
		int width = keyboard.nextInt();

		Rectangle rectangle2 = new Rectangle(width, height);
		System.out.println("The area of the new rectangle is " + rectangle2.getArea());

		System.out.println("What is the new width?");
		width = keyboard.nextInt();
		rectangle2.setWidth(width);
		System.out.println("The new area of the rectangle is " + rectangle2.getArea());

	}

}
