//  Java program to calculate area of a Sphere in java

import java.util.Scanner;
public class AreaOfSphere {
     
    public static void main(String[] args) {
        System.out.println("Enter radius of circle: ");
        Scanner sn = new Scanner(System.in);
        Double radius = sn.nextDouble();
      
        //area of sphere = 4*pi*r*r
        Double area = 4*Math.PI * radius * radius;        
        System.out.println("Area of sphere = "+area);
    }
}
