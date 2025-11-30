import java.util.Scanner;

/**
 * Write a description of class week4_qn5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4_qn5
{
     public static void main (String[]args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter the number");
        
        int num = input.nextInt();
        
     if (num %3 == 0)
{
   if ( num % 5 ==0)
   {
       System.out.println("DIVISIBLE BY BOTH 3 AND 5");
   
    }
    else
    {
     System.out.println(" NOT DIVISIBLE BY BOTH 3 AND 5"); 
    }

}
}
}