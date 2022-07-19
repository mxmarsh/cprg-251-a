package mod11.practice;

import java.io.*;

public class DeserializationDriver {

	public static void main(String[] args) {
		try {
			// create stream objects
			FileInputStream fis = new FileInputStream("res/students.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			// read the objects
			Student a = (Student) ois.readObject();
			Student b = (Student) ois.readObject();

			// print them to screen
			System.out.println(a);
			System.out.println(b);

			// close streams
			ois.close();
			fis.close();

		} catch (Exception e) {
			System.out.println("Sorry, something went wrong.");
		}

	}

}
