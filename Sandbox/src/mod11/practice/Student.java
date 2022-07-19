package mod11.practice;

import java.io.Serializable;

public class Student implements Serializable {

	static final long serialVersionUID = 2L;

	private String id;
	private String name;
	private double gpa; // added this field in v2.0

	public Student() {
	}

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// TO DO: override equals()

	@Override
	public String toString() {
		return "  ID: " + this.id + "\nName: " + this.name;
	}
}
