import java.util.Scanner;

/**
 * Write a description of class week4_qno4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4_qno4
{
     public static void main (String[]args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter the number");
        
        int num = input.nextInt();
        
     if (num %3 == 0)
{
   if ( num % 5 ==0)
   {System.out.println("DIVISIBLE BY BOTH 3 AND 5");
    }
    else 
    {
        System.out.println("DIVISIBLE BY 3 BUT NOT BY 5");
    }
}
 else if ( num %5 ==0)    {
    System.out.println("DIVISIBLE BY 5 BUT NOT BY 3");
    }
else 
{
  System.out.println("divisible by nither of them");
}
        
    }
  }
