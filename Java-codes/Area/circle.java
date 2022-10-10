//  Java program to calculate area of a circle in java

import java.util.Scanner;
public class AreaOfCircle {
     
    public static void main(String[] args) {
        System.out.println("Enter radius of circle: ");
        Scanner sn = new Scanner(System.in);
        Double radius = sn.nextDouble();
         //area of circle = pi*r*r
        Double area = Math.PI * radius * radius;        
        System.out.println("Area of circle = "+area);
    }
}
