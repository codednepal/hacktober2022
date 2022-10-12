import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number ");
        int num,i,f=1;
        num=in.nextInt();
        for ( i=1;i<=num;i++)
        {
            f=f*i;
        }
        if(num==0)
            System.out.println("factorial of given number is : 0 ");
        else
            System.out.println("factorial of given number is :"+f);
    }
}    
