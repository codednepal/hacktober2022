
// a program to calculate area of triangle in Java
import java.util.Scanner;
class AreaOfTriangle 
{
   public static void main(String[] args) {      
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the breadth of the Triangle:");
      Double b= s.nextDouble();
 
      System.out.println("Enter the height of the Triangle:");
      Double h= s.nextDouble();
 
      //Area = ( breadth * height )/2
      double area=(b*h)/2;
      System.out.println("Area of Triangle is: " + area);      
   }
}
