import java.util.Scanner;


public class tutorial_week6
{
    public static void main(String[]args)
    {
        
        
    Scanner input = new Scanner(System.in);
    int [] age;
    age = new int[5];
    
    System.out.println(age.length);
    
    for (int i=0; i<=age.length-1;i++)
    {
        System.out.println("enter the age");
        age[i]= input.nextInt();
        
        System.out.println("The age of s5 students is"+(age[i]));
        
    
    }
    
    
    
    
    int [] agr ={5,10,15,20,25};
    
    for (int i=age.length; i>=0;i--)
    {
     System.out.println(agr[i]);
     
    }
    int [] rev = new int [agr.length];
    for (int i=0; i<rev.length;i++)
    {
     System.out.println(rev[i]);
    }
    
    
    
    
    
    int sum =0;
    for (int i=0; i<age.length;i--)
    {
     System.out.println(agr[i]);
     sum += agr[i];
     
    }
    System.out.println(sum);
    
    
    
    
    
    int [] [] matrix = { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12} };
    
    for(int i =0 ; i<matrix.length; i++)
    {
       for(int j =0 ; j< matrix[i].length; j++)
       {
        
           System.out.print(matrix[i][j]);
           
       }
       System.out.println();
    }
    }
}