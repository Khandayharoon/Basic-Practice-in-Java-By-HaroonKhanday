package PracticeOnNmber;

public class VolumeOfShapes {

	public static void main(String[] args) {
		// Example values for dimensions
		double coneRadius = 3.0;
		double coneHeight = 5.0;

		double prismBaseArea = 6.0;
		double prismHeight = 8.0;

		double cylinderRadius = 4.0;
		double cylinderHeight = 10.0;

		double sphereRadius = 2.0;

		double pyramidBaseArea = 9.0;
		double pyramidHeight = 6.0;

		double cubeSide = 4.0;

		// Calculate and print volumes
		System.out.println("Volume of Cone: " + calculateConeVolume(coneRadius, coneHeight));
		System.out.println("Volume of Prism: " + calculatePrismVolume(prismBaseArea, prismHeight));
		System.out.println("Volume of Cylinder: " + calculateCylinderVolume(cylinderRadius, cylinderHeight));
		System.out.println("Volume of Sphere: " + calculateSphereVolume(sphereRadius));
		System.out.println("Volume of Pyramid: " + calculatePyramidVolume(pyramidBaseArea, pyramidHeight));

		// Calculate and print surface areas
		System.out.println("Curved Surface Area of Cylinder: "
				+ calculateCurvedSurfaceAreaOfCylinder(cylinderRadius, cylinderHeight));
		System.out.println("Total Surface Area of Cube: " + calculateTotalSurfaceAreaOfCube(cubeSide));
	}

	// Volume of a cone: (1/3) * π * r^2 * h
	public static double calculateConeVolume(double radius, double height) {
		return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
	}

	// Volume of a prism: base area * height
	public static double calculatePrismVolume(double baseArea, double height) {
		return baseArea * height;
	}

	// Volume of a cylinder: π * r^2 * h
	public static double calculateCylinderVolume(double radius, double height) {
		return Math.PI * Math.pow(radius, 2) * height;
	}

	// Volume of a sphere: (4/3) * π * r^3
	public static double calculateSphereVolume(double radius) {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}

	// Volume of a pyramid: (1/3) * base area * height
	public static double calculatePyramidVolume(double baseArea, double height) {
		return (1.0 / 3.0) * baseArea * height;
	}

	// Curved Surface Area of a cylinder: 2 * π * r * h
	public static double calculateCurvedSurfaceAreaOfCylinder(double radius, double height) {
		return 2 * Math.PI * radius * height;
	}

	// Total Surface Area of a cube: 6 * side^2
	public static double calculateTotalSurfaceAreaOfCube(double side) {
		return 6 * Math.pow(side, 2);
	}

}
