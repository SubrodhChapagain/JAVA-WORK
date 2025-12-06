import java.util.Scanner;

public class week5qn9
{
    public static void main (String []args)
    {
    
    Scanner input = new Scanner(System.in);
    System.out.println("enter the number");
    int number = input.nextInt();
    int reversed = 0;
    while(number>0){
        int digit = number%10;
        reversed = reversed * 10+ digit;
        number = number/10;
    }
    System.out.println(reversed);
    
    
    }
}