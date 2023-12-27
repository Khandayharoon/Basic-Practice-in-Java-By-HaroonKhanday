package PracticeOnNmber;

public class GradesAccording {

	public static void main(String[] args) {
		Grades(40);

	}

	private static void Grades(int markes) {
		char gards;

		switch (markes / 10) {
		case 10:
		case 9:
			gards = 'A';
			break;

		case 8:
			gards = 'B';
			break;

		case 7:
			gards = 'C';
			break;
		case 6:
			gards = 'D';
			break;
		default:
			gards = 'F';
			break;

		}
		System.out.println("Marks: " + markes + " Grade: " + gards);
	}

}
