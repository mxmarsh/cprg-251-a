
public class Sandbox {

	public static void main(String[] args) {
		String str = "Hello!";
		doSomething(str);
		System.out.println(str);

	}

	private static void doSomething(String str) {
		str = "Goodbye!";
	}

}
