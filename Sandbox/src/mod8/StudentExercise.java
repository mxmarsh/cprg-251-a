package mod8;

import java.io.*;

public class StudentExercise {

	public static void main(String[] args) {

		try {

			// create a RAF object
			File f = new File("res/students.bin");
			RandomAccessFile raf = new RandomAccessFile(f, "rw");

			// set the pointer to the start of the file
			raf.seek(0);

			// write the info for Joe Blow: name, age, GPA, active
			String paddedName = String.format("%-75s", "Joe Blow");
			raf.writeUTF(paddedName);
			raf.writeByte(23);
			raf.writeFloat(2.1f);
			raf.writeBoolean(true);

			// write the info for John Smith: name, age, GPA, active
			raf.writeUTF(String.format("%-75s", "John Smith"));
			raf.writeByte(45);
			raf.writeFloat(3.7f);
			raf.writeBoolean(false);

			// write the info for Jane Doe: name, age, GPA, active
			raf.writeUTF(String.format("%-75s", "Jane Doe"));
			raf.writeByte(41);
			raf.writeFloat(2.9f);
			raf.writeBoolean(true);

			// write the info for Tom Cruise: name, age, GPA, active
			raf.writeUTF(String.format("%-75s", "Tom Cruise"));
			raf.writeByte(71);
			raf.writeFloat(1.5f);
			raf.writeBoolean(false);

			raf.close();

		} catch (IOException e) {
			System.out.println("Sorry, something went wrong.");
		}

	}

}
