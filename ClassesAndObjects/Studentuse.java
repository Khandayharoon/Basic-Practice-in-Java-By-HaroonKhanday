package ClassesAndObjects;

public class Studentuse {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.name = "Haroon Khanday";
		s1.fatherName = "Nissar";
		s1.id = 313;

		System.out.println("properties of a student S1 are");
		System.out.print(s1.name + " " + s1.fatherName + " " + s1.id);

	}

}
