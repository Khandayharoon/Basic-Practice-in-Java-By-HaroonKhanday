package ClassesAndObjects;

public class ComplexNumberUse {

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(3, 7);
		c1.print();
		c1.setReal(10);
		c1.setimaginary(9);
		c1.print();

		ComplexNumber c2 = new ComplexNumber(2, 3);
		c2.print();
		c1.add(c2);
		c1.print();
		c2.print();

		ComplexNumber c3 = new ComplexNumber(4, 5);
		c3.print();
		c3.multiply(c2);
		c3.print();

		ComplexNumber c4 = ComplexNumber.add(c2, c3);
		c2.print();
		c3.print();
		c4.print();

	}

}
