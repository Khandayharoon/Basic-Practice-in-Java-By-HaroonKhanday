package PracticeOnNmber;

public class PerimetersOfAllShapes {

	public static void main(String[] args) {

		PerimeterOfParallelogram();
		PerimeterOfEquilateral();
		perimeterOfCircle();
		PerimeterOfRectangle();
		PerimeterOfSquare();
		PerimeterOfRhombus();
	}

	static void PerimeterOfRhombus() {
		// Example value for the side length
		double sideLength = 6.0;
		double perimeter = 4 * (sideLength);

		System.out.println("The perimeter of the rhombus is: " + perimeter);

	}

	static void PerimeterOfSquare() {
		double sideLength = 8.0;

		double perimeter = 4 * (sideLength);

		System.out.println("The perimeter of the square is: " + perimeter);

	}

	static void PerimeterOfRectangle() {
		double length = 10.0;
		double width = 5.0;

		double perimeter = 2 * (length + width);

		System.out.println("The perimeter of the rectangle is: " + perimeter);

	}

	static void PerimeterOfParallelogram() {
		// Example values for side lengths and angle (in degrees)
		double side1 = 5.0;
		double side2 = 7.0;
		double perimeter = 2 * (side1 + side2);

		System.out.println("The perimeter of the parallelogram is: " + perimeter);

	}

	private static void PerimeterOfEquilateral() {
		int a = 30;
		double perimeter = 3 * a;

		System.out.println("Perimeter Of Equilateral P=3a is :" + perimeter);
	}

	static void perimeterOfCircle() {
		int radius = 20;

		double perimeter = 2 * Math.PI * radius;
		System.out.println("Perimeter Of Circle C=2πr : is " + perimeter);

	}

}
