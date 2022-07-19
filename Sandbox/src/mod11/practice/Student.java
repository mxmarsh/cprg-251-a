package mod11.practice;

import java.io.Serializable;

public class Student implements Serializable {

	private String id;
	private String name;

	public Student() {
	}

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
}
