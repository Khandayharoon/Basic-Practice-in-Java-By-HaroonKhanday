package PracticeOnNmber;

public class AreaofShapes {

	public static void main(String[] args) {

//		areaOfIsoscelesTriangle();
//		areaOfParallelogram();
//		areaOfRhombus();
		areaOfEquilateral();
	}

	static void areaOfEquilateral() {
		 int a = 20;
	        double area = Math.sqrt(3.0 / 4) * Math.pow(a, 2);
		System.out.println(" Area Of Equilateral Triangle A = (√3/4)a² :" + area);

	}

	static void areaOfRhombus() {
		int Pdigonal = 6;
		int Qdigonal = 13;
		double area = (Pdigonal * Qdigonal) / 2;
		System.out.println("Area Of Rhombus: " + " " + area);

	}

	static void areaOfParallelogram() {
		int h = 6;
		int b = 13;
		double area = (h * b);
		System.out.println("Area Of Parallelogram: " + " " + area);

	}

	static void areaOfIsoscelesTriangle() {
		int height = 5;
		int base = 3;
		double area = (height * base) / 2;
		System.out.println("Area Of Isosceles Triangle: " + " " + area);

	}

}
