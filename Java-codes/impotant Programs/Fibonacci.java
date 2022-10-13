import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a,b=1,c=0,num;
        System.out.println("Enter how many number you want to print fibonacci series");
        num= in.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.println(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
} 
