package mod13;

import java.util.Scanner;

import mod13.exceptions.InvalidCharacterException;

public class StringPalindromeExample {

	public static void main(String[] args) {

		Scanner keyboard;
		String input;

		do {
			keyboard = new Scanner(System.in);
			System.out.println("Enter the word you want to test:");
			String testString = keyboard.next();
			try {
				if (isPalindrome(testString))
					System.out.println(testString + " is a palindrome!");
				else
					System.out.println(testString + " is NOT a palindrome!");

			} catch (InvalidCharacterException e) {
				System.out.println("Not a valid input. Please try again.");
			}

			System.out.println("\nType x to exit or anything else to re-start the program.");
			input = keyboard.next();

		} while (!input.equals("x"));
		keyboard.close();
		System.out.println("Goodbye!");

	}

	public static boolean isPalindrome(String s) throws InvalidCharacterException {

		char firstChar = s.charAt(0);
		char lastChar = s.charAt(s.length() - 1);

		if (!Character.isLetter(firstChar) || !Character.isLetter(lastChar))
			throw new InvalidCharacterException();

		System.out.println("Currently testing string: " + s);

		// base case: if string is empty or has one character, yes it is a palindrome
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		// recursive (general) case:
		if (firstChar == lastChar) {
			return isPalindrome(s.substring(1, s.length() - 1));
		} else {
			return false;
		}

	}

}
