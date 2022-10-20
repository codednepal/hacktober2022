
//program to check number is even or odd
import java.util.Scanner;

public class EvenOddCheck {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int num = in.nextInt();
		
		System.out.printf("Number %d is %s.", num, (num%2 == 0) ? "even" : "odd");
		if (num % 2 == 0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
	}
}
