package mod3FakeSchoolExercise;

/**
 * Class description:
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class AppDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person bob = new Person();

		bob.setName("Bob");
		bob.setCardBalance(1.23);

		System.out.println(bob);

		Student moose = new Student();
		moose.setName("Musqunamu'k");
		moose.setCreditsEarned(2);

		System.out.println(moose);
		System.out.println(moose.useHiddenToString());

	}

}
