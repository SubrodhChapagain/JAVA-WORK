import java.util.Scanner;

/**
 * Write a description of class week4_QN2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4_QN2
{
    public static void main (String[]args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter the number");
        
        int num = input.nextInt();
        
        
        if (num%2==0)
        {
            System.out.println("even");
    
        }
         else
         {
             System.out.println("odd");
         }
    
    }
}