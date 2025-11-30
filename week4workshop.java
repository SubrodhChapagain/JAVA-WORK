import java.util.Scanner;

/**
 * Write a description of class week4workshop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4workshop
{
    public static void main (String[]args){
    
    Scanner input = new Scanner (System.in);
    
    System.out.println("enter your marks");
    
    double marks = input.nextDouble();
    
    if(marks>=45)
    {
        System.out.println("pass");
    }
    else 
    {
        System.out.println("Fail");
    }
    
    
    
    
    
    
    
    }
}