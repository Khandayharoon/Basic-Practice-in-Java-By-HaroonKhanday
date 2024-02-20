package ClassesAndObjects;

public class ComplexNumber {
	private int real;
	private int imaginary;

//	Default Constructor
	public ComplexNumber() {

	}

	public ComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;

	}

	public void print() {
		System.out.println(real + " + " + "i" + imaginary);
	}

	public void setReal(int real) {
		this.real = real;
	}

	public void setimaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	public void add(ComplexNumber c2) {
		this.real = this.real + c2.real;
		this.imaginary = this.imaginary + c2.imaginary;

	}

	public void multiply(ComplexNumber c2) {
		int newReal = (this.real * c2.real) - (this.imaginary * c2.imaginary);
		int newImaginary = (this.real * c2.imaginary) + (this.imaginary * c2.real);

		this.real = newReal;
		this.imaginary = newImaginary;
	}

	public static ComplexNumber add(ComplexNumber c2, ComplexNumber c3) {

		int newReal = c2.real + c3.real;
		int newImg = c2.imaginary + c3.imaginary;

		ComplexNumber c4 = new ComplexNumber(newReal, newImg);
		return c4;

	}

}
