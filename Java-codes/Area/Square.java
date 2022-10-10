
import java.util.Scanner;
public class AreaOfSquare {
     
    public static void main(String[] args) {
        System.out.println("Enter side: ");
        Scanner sn = new Scanner(System.in);
        Double side = sn.nextDouble();
        //area of square= side*side
        Double area = side*side;        
        System.out.println("Area of square = "+area);
    }
}
