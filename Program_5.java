
package Assignment1;

import java.util.Scanner;

public class Program_5 {
    public static void main(String []args)
    {
        Scanner no= new Scanner(System.in); 
        System.out.println("input first no=");
        int a=no.nextInt();
        System.out.println("input 2nd no=");
        int b=no.nextInt();
        int c = a*b;
        System.out.println("A*B="+c);
    }
    
}
