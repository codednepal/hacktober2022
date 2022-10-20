import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any number ");
		int num = scanner.nextInt(), factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
        
		System.out.printf("Factorial of given %d is : %d.\n", num, factorial);

		scanner.close();
	}
}
