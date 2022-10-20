//// A program to calculate area of Rectangle in Java

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter side: ");
		Double side = scanner.nextDouble();
		
		// area of square= side*side
		Double area = side * side;
		System.out.println("Area of square = " + area);
		scanner.close();
	}
}
