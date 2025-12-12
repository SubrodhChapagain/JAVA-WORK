import java.util.Scanner;

public class workshop6qn5
{
    public static void main(String[] args)
    {
    
    String[] name = {"Morang","kathmandu","kaski","sindhuli"};
    
    for(int i=0; i<name.length;i++)
     {
     
         System.out.println("The lists are "+ (i+1) +  name[i]);

    }
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of districts");
    int na = input.nextInt();
    
    String[] district= new String[na];
    
    for(int j=0; j<district.length; j++)
    {
     
        district[j] = input.next();
        
    }
    
    for(int j=0; j<district.length; j++)
    {
        
        System.out.println("The list of districts are: "+ district[j]);
    }
    
}
}