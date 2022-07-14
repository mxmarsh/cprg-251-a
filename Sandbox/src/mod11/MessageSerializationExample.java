package mod11;

import java.io.*;

public class MessageSerializationExample {

	public static void main(String[] args) {
		try {
			/* SERIALIZATION: */
			// create a FileOutputStream object
			FileOutputStream fos = new FileOutputStream("res/mod11message.bin");

			// create a ObjectOutputStream object
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// use writeObject() to write to the file
			Message m = new Message("hello");
			oos.writeObject(m);

			// close the streams
			oos.close();
			fos.close();

		} catch (IOException e) {
			System.out.println("Sorry, something went wrong.");
		}

	}

}
