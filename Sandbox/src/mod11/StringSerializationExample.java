package mod11;

import java.io.*;

public class StringSerializationExample {

	public static void main(String[] args) {
		try {
			/* SERIALIZATION: */
			// create a FileOutputStream object
			FileOutputStream fos = new FileOutputStream("res/mod11string.bin");

			// create a ObjectOutputStream object
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// use writeObject() to write to the file
			String a = "happy birthday, Penny";
			oos.writeObject(a);

			// close the streams
			oos.close();
			fos.close();

			/* DE-SERIALIZE */
			// create a FileInputStream object
			FileInputStream fis = new FileInputStream("res/mod11string.bin");

			// create an ObjectInputStream object
			ObjectInputStream ois = new ObjectInputStream(fis);

			// use readObject() to read from the file
			String result = (String) ois.readObject();
			System.out.println("Object has been read.\n" + result);

			// close the streams
			ois.close();
			fis.close();

		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Sorry, something went wrong.");
		}

	}

}
