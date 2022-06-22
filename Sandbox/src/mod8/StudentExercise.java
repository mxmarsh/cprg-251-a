package mod8;

import java.io.*;

public class StudentExercise {

	public static void main(String[] args) {

		final byte RECORD_LENGTH = 77 + 1 + 4 + 1;
		// 75 chars for name, 1 byte for age, 4 bytes for GPA, 1 byte for active

		try {
			// create a RAF object
			RandomAccessFile raf = new RandomAccessFile("res/students.bin", "rw");

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

			// move the pointer back to the start
			raf.seek(0);

			// for each student:
			// read student information and print to the screen
			System.out.println("========== PRINTING ALL STUDENTS ==========");
			for (int counter = 0; counter < raf.length(); counter += RECORD_LENGTH) {
				System.out.println("Student #" + (counter / RECORD_LENGTH + 1) + ":\t" + raf.readUTF().trim()
						+ "\n\tAge:\t" + raf.readByte() + "\n\tGPA:\t" + raf.readFloat() + "\n\tActive:\t"
						+ raf.readBoolean() + "\n");
			}

			// then, do the same, but ONLY show active students
			raf.seek(0);
			System.out.println("========== PRINTING ACTIVE STUDENTS ==========");
			// for each ACTIVE student: display student info
			for (int counter = 0; counter < raf.length(); counter += RECORD_LENGTH) {

				// move the pointer to the active flag and read in its value:
				raf.seek(counter + RECORD_LENGTH - 1);
				boolean isActive = raf.readBoolean(); // now the pointer is at the end of this record

				if (isActive) {
					// move the pointer back to the start of the record:
					raf.seek(counter);

					System.out.println("Student #" + (counter / RECORD_LENGTH + 1) + ":\t" + raf.readUTF().trim()
							+ "\n\tAge:\t" + raf.readByte() + "\n\tGPA:\t" + raf.readFloat() + "\n\tActive:\t"
							+ raf.readBoolean() + "\n"); // now the pointer is at the end of this record
				} // end if
			} // end for

			raf.close();

		} catch (IOException e) {
			System.out.println("Sorry, something went wrong.");
		}

	}

}
