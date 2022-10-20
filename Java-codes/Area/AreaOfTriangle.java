// A program to calculate area of triangle in Java
import java.util.Scanner;

class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the breadth of the Triangle:");
		Double breadth = scanner.nextDouble();

		System.out.println("Enter the height of the Triangle:");
		Double height = scanner.nextDouble();

		// Area = ( breadth * height )/2
		double area = (breadth * height) / 2;
		System.out.println("Area of Triangle is: " + area);
		
		scanner.close();
	}
}
