// Java program to Illustrate Working of concat() method
import java.util.Scanner;
 public class Concatenate {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Write anything you want ");
        //input string 1
        String str = in.nextLine();

        //input string 2
        System.out.println("Write anything you want to concatenated ");
        String str1= in.nextLine();
        String str2 = str.concat(str1);
        System.out.println(str2);
    }
}
