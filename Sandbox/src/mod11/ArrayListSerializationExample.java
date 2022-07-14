package mod11;

import java.io.*;
import java.util.ArrayList;

public class ArrayListSerializationExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("res/arraylist.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			ArrayList<Integer> nums = new ArrayList<>();
			nums.add(1);
			nums.add(2);

			oos.writeObject(nums);

			oos.close();

			// de-serialize it

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/arraylist.bin"));

			ArrayList result = (ArrayList) ois.readObject();
			System.out.println(result);

			oos.close();
		} catch (Exception e) {
			System.out.println("Sorry, something went wrong.");

		}

	}

}
