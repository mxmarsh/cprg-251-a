package mod9.contracts;

/**
 * 
 * Class description: a program that does simple arithmetic operations
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */
public interface SimpleCalculator {

	/**
	 * A method that adds together 2 provided values and returns the sum.
	 * 
	 * @param num1 the first value
	 * @param num2 the second value
	 * @return the sum of the 2 values
	 */
	public double add(double num1, double num2);

	/**
	 * A method that subtracts one number from another and returns the difference.
	 * 
	 * @param num1 the first value
	 * @param num2 the second value
	 * @return the difference of num1 - num2
	 */
	public double subtract(double num1, double num2);

	/**
	 * A method that multiplies two numbers together and returns the product.
	 * 
	 * @param num1 the first value
	 * @param num2 the second value
	 * @return the product of the 2 provided numbers
	 */
	public double multiply(double num1, double num2);

	/**
	 * A method that divides one number by another and returns the quotient.
	 * 
	 * @param num1 the first value
	 * @param num2 the second value
	 * @return the quotient of dividing num1 by num2
	 * @throws ArithmeticException if num2 is zero
	 */
	public double divide(double num1, double num2) throws ArithmeticException;

	/**
	 * Method to calculate the square of a number
	 * 
	 * @param num1 the value provided
	 * @return the square of num1 (i.e. num1 * num1)
	 */
	public double square(double num1);

	/**
	 * Method to calculate the square root of a number
	 * 
	 * @param num1 the value provided
	 * @return the square root of num1 (i.e. num1 ^ .5)
	 * @throws NegativeSquareRootException if num1 is negative
	 */
	public double squareRoot(double num1) throws NegativeSquareRootException;
}
