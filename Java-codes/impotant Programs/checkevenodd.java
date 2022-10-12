//program to check number is even or odd
import java.util.Scanner;
class Check
{
  public static void main(String[] args)
  {
    Scanner in= new Scanner(System.in);
    System.out.println("Enter any number");
    int num =in.nextInt();
    if(num%2==0)
      System.out.println("number is even");
    else
      System.out.println("numberis odd");
  }
}
