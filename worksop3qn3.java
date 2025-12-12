import java.util.Scanner;


public class worksop3qn3
{
    public static void main(String[]arge)
    {
    
    String[] name = {"saroj","sushant","ujjawal","rabina","sandesh"};
    
    for (int i =0; i< name.length;i++)
    {
       System.out.println(name[i]);
       
    }
    
    System.out.println(name[2]);
    
    name[4] ="hero";
    System.out.println(name[4]);
    
    
    Scanner input = new Scanner(System.in);
    
    
    for(int j= 0; j<name.length; j++)
    {
     name[j] = input.next();

    }
    
    
    for (int j = 0; j < name.length; j++) {
            System.out.println(name[j]);
    
    }
    
}
}