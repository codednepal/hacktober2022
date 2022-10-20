// a program to calculate area of Rectangle in Java
import java.util.Scanner;

class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the Triangle:");
		Double l = scanner.nextDouble();

		System.out.println("Enter the breadth of the Triangle:");
		Double b = scanner.nextDouble();

		// Area = ( length * breadth )
		double area = (l * b);
		System.out.println("Area of Rectangle is: " + area);
		
		scanner.close();
	}
}
