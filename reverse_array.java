
public class reverse_array
{
    public static void main (String[]arge)
    {
    
    
    int [] agr ={5,10,15,20,25};
    
    int [] rev = new int [agr.length];
    for (int i=0; i<agr.length;i++)
    {
        rev[i]= agr[agr.length-1-i];
     System.out.println(rev[i]);
    }
}
}
