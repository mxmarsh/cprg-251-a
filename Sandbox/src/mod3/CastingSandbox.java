package mod3;

public class CastingSandbox {

	public static void main(String[] args) {
		// PRIMITIVES:
		// implicit casting / widening:
		short x = 25;
		long y = x;

		System.out.println("The value of y is " + y);

		// explicit casing / narrowing
		int a = 200;
		System.out.println("the value of a is " + a);
		byte b = (byte) a;
		System.out.println("the value of b is " + b);

		// casting between reference types
		// up casting
		Rectangle object1 = new Rectangle();
		object1.setColor("blue");

		Shape object2 = object1;
		object2.setColor("red");

		Object object3 = object2;

		// downcasting
		String aa = "Hello";
		Object bb = aa; // upcasting
		String cc = (String) bb; // downcasting successfully! :)

		Rectangle d = new Rectangle();
		Shape e = d; // upcasting
		// Circle f = (Circle) e; // downcasting BADLY
		// f.setRadius(5); // this fails, because f is actually a Rectangle

		if (e instanceof Circle) {
			System.out.println("e is a Circle");
			// if we know it's actually a Circle, we know it's safe to downcast:
			Circle f = (Circle) e;
			f.setRadius(5);
		} else {
			System.out.println("e is NOT a Circle");
		}

		if (e instanceof Rectangle) {
			System.out.println("e is a Rectangle");
		} else {
			System.out.println("e is NOT a Rectangle");
		}

		if (e instanceof Shape) {
			System.out.println("e is a Shape");
		} else {
			System.out.println("e is NOT a Shape");
		}

		if (e instanceof Object) {
			System.out.println("e is a Object");
		} else {
			System.out.println("e is NOT a Object");
		}

	}

}
