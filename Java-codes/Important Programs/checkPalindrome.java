import java.util.Scanner;
public class CheckPalindrome
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int num,b,cpy,rev=0;
    System.out.println("Enter any number ");
    num=in.nextInt();
    cpy=num;
    while(num!=0)
    {
      b=num%10;
      rev=rev*10+b;
      num=num/10;
    }
    if(cpy==rev)
      System.out.println("number is palindrome");
      else
       System.out.println("number is not palindrome");
  }
}
    
    
  
