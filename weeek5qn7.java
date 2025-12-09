import java.util.Scanner;


public class weeek5qn7
{
    public static void main(String[]args)
    {
    Scanner input = new Scanner(System.in);
    int sum =0;
    int diff =0;
    double mul = 1;
    double div = 1;
    
    boolean a = true;
    while(a)
    {
    System.out.println("Enter 1st number");
    int n= input.nextInt();
    System.out.println("Enter 2st number");
    int no= input.nextInt();
    System.out.println("Enter operation");
    char op = input.next().charAt(0);
    
    switch (op)
    {
       case '+':
           sum = n+no;
           System.out.println("sum is"+sum);  break;
    
       case '-':
           diff = n - no;
           System.out.println("diff is"+diff); break;
        case '*':
            mul = n*no;
            System.out.println("mul is"+mul); break;
        default:
            System.out.println("Invalid operations");
    }
      
    System.out.println("wanna continue");
    char ch = input.next().charAt(0);
    
    if(ch == 'y' || ch == 'Y')
    {
      a = true;
    }
     else
     {
        a = false;
    }
    
    
    }
    

    }
}