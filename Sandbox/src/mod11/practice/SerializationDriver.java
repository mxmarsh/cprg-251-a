package mod11.practice;

import java.io.*;

public class SerializationDriver {

	public static void main(String[] args) {
		try {
			// create the stream objects
			FileOutputStream fos = new FileOutputStream("res/students.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// create some students
			Student bob = new Student("A123", "Bob");
			Student moose = new Student("D456", "Moose");

			// write them to a file
			oos.writeObject(bob);
			oos.writeObject(moose);

			// close streams
			oos.close();
			fos.close();

		} catch (Exception e) {
			System.out.println("Sorry, something went wrong.");
			e.printStackTrace();
		}

	}

}
