package ClassesAndObjects;

public class FractionUse {

	public static void main(String[] args) {

		Fraction f1 = new Fraction(4, 6);

		Fraction f2 = new Fraction(5, 10);
////		f1.add(f2);
//		f1.print();

//		Fraction f3 = Fraction.add(f1, f2);
//		f3.print();
		
		Fraction f3 = new Fraction();
        f3 = f3.add(f1, f2);
        f3.print();
	}

}
