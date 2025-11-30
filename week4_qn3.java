import java.util.Scanner;

/**
 * Write a description of class week4_qn3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4_qn3
{
    public static void main (String[]args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter the number");
        
        int num = input.nextInt();
        
        if (num>0)
        {
           System.out.println("Positive no");
        }
        else if (num == 0)
        {
           System.out.println("no is neutral");
        }
        else 
        {
           System.out.println("negative no");
           
        }
    }
}