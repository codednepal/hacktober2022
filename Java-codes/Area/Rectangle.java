// a program to calculate area of Rectangle in Java
import java.util.Scanner;
class AreaOfRectangle 
{
   public static void main(String[] args) {      
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the length of the Triangle:");
      Double l= s.nextDouble();
 
      System.out.println("Enter the breadth of the Triangle:");
      Double b= s.nextDouble();
 
      //Area = ( length * breadth )
      double area=(l*b);
      System.out.println("Area of Rectangle is: " + area);      
   }
}
