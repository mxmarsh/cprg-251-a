package mod3FakeSchoolExercise;

/**
 * Class description: to test our Employee hierarchy
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class AppDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Person bob = new Person();
		 * 
		 * bob.setName("Bob"); bob.setCardBalance(1.23);
		 * 
		 * System.out.println(bob);
		 * 
		 * Student moose = new Student(); moose.setName("Musqunamu'k");
		 * moose.setCreditsEarned(2);
		 * 
		 * System.out.println(moose); System.out.println(moose.useHiddenToString());
		 */

	}

	public void checkEmployee(Employee mysteryObject) {
		if (mysteryObject instanceof Faculty) {
			Faculty sameObject = (Faculty) mysteryObject;
			System.out.println(sameObject.getSpecialty());
		} else if (mysteryObject instanceof Staff) {
			System.out.println(((Staff) mysteryObject).getTitle());
		} else
			System.out.println("sorry, bad input");

	}

}
