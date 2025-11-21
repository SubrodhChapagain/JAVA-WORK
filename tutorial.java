import java.util.Scanner;

/**
 * Write a description of class tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial
{
    
   int oxygenLevel = 80; // instance variable (DIFFERENT FOR DIFFERENT OBJECTS)
    static int rrt;       // static variable (SAME AND SHARED BY ALL OBJECTS)
    
  public static void main(String[] args){
      int age = 16;
      
      System.out.println(age); //local variable 
      System.out.println(tutorial.rrt);
      
      
      
      // IMPLICIT TYPECASTING  SANO lai THULO 
      
      double dtr = age;
      System.out.println(dtr);
      
      
      
      // EXPLICIT Typecasting  (NARROWING) 
      
       double db = 10.09;
       int ite = (int)db;
       System.out.println(ite);
       
       
       // EXCEPTION IN ARITHMETIC 
       
       byte b1= 10;
       byte b2 = 11;
       
       byte sum = (byte)(b1+b2);
       
        
       //short, maximum, size, bytes
       
       
       
      
     System.out.println(Byte.MAX_VALUE);
     System.out.println(Byte.MIN_VALUE);
     System.out.println(Byte.SIZE);
     System.out.println(Byte.BYTES);
     
     
     
     
     
     
     
     
     
     
     
     
     
      
     // ESCAPE SEQUENCE
     
     System.out.println("HELLO\nWorld");
     System.out.println("HELLO\tWorld");
     System.out.println("she said\" Hi\" ");
     
     
     // unicode escape sequence
     
     System.out.println("\u2764");
     
     
    
    
    
    
    
    
    
    
    
}

  
    
    
}    