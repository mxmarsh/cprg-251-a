package mod11;

import java.io.*;

public class MessageDeserialization {

	public static void main(String[] args) {
		try {
			/* DE-SERIALIZE */
			// create a FileInputStream object
			FileInputStream fis = new FileInputStream("res/mod11message.bin");

			// create an ObjectInputStream object
			ObjectInputStream ois = new ObjectInputStream(fis);

			// use readObject() to read from the file
			Message result = (Message) ois.readObject();
			System.out.println("Object has been read.\n" + result);

			// close the streams
			ois.close();
			fis.close();
		} catch (Exception e) {
			System.out.println("Sorry, something went wrong.");

		}

	}

}
