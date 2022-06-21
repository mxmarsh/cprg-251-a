package mod8;

import java.io.*;

/**
 * Class description: Playing around with RAF methods.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Sandbox {

	public static void main(String[] args) {

		try {
			// create a new RAF
			File f = new File("res/mod8sandbox.bin");
			RandomAccessFile raf = new RandomAccessFile(f, "rw");

			// set our pointer to the START of the file
			raf.seek(0);

			// write an int
			raf.writeInt(42);

			// move our pointer back to the start of the file
			// raf.seek(0);
			raf.seek(2);

			// read that value
			// int a = raf.readInt();
			// float b = raf.readFloat();
			byte c = raf.readByte();

			// print it to the screen
			// System.out.println("The value of a is: " + a);
			// System.out.println("The value of b is: " + b);
			System.out.println("The value of c is: " + c);

			// close our file
			raf.close();

		} catch (IOException e) {
			System.out.println("Something went wrong. Sorry.");
		}

	}

}
