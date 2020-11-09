
package Assignment1;


public class Program_21
{
    public static String tooctal(int decimal)
    {
        String octal="";
        int rem;
        char octalchars[]=
        {'0','1','2','3','4','5','6','7'};
        while(decimal>0)
        {
            rem=decimal%8;
            octal=octalchars[rem]+octal;
            decimal=decimal/8;
        }return octal;
        
    }
    public static void main(String []args)
    {
       System.out.println("octal of 15 is="+tooctal(15));
          
    }
    
}

