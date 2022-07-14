package mod11;

import java.io.*;

public class SerializingAgainExample {

	public static void main(String[] args) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res/str.bin"));

			StringBuilder sb = new StringBuilder("a");
			oos.writeObject(sb);

			oos.reset(); // "forgets" what we already serialized

			sb.append("b"); // Changes StringBuilder to "ab"
			oos.writeObject(sb);

			oos.close();

			// to see what happened, let's deserialize
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/str.bin"));

			StringBuilder result = (StringBuilder) ois.readObject();
			System.out.println(result);

			result = (StringBuilder) ois.readObject();
			System.out.println(result);

			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Sorry, something went wrong.");

		}

	}

}
