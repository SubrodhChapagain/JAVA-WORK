
/**
 * Write a description of class week4tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4tutorial
{
    public static void main (String[]args){
    
   int num = 15;
    
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
 else if ( num %5 ==0)
  { 
     if (num %3 == 0)
     {
         System.out.println("DIVISIBLE BY BOTH 5 AND 3");
        }
    
    else 
    {
    System.out.println("DIVISIBLE BY 5 BUT NOT BY 3");
    }
   }
}
}

