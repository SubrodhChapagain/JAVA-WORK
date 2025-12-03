import java.util.Scanner;

public class week5tutorial1
{
    public static void main (String[]args)
    {
    
    Scanner input = new Scanner (System.in);
    System.out.println("Enter the number");
    int n = input.nextInt();
    
    int sum = 0;
    
    for(int i =1 ;i<=n; i++)
        {
          sum = sum+i;
          System.out.println(sum);
        }
        System.out.println("total sum is"+ sum);
    }
}