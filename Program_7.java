
package Assignment1;

import java.util.Scanner;
public class Program_7 {
    public static void main(String []args)
    {
        int i,number,j;
        Scanner no=new Scanner(System.in);
        System.out.println("Input a Number=");
        number=no.nextInt();
        
        for(i=1;i<11;i++)
        {
            j=number*i;
            System.out.println(number+"*"+i+"="+j);
        }
    }
    
}
