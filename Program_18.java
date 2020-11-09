
package Assignment1;


public class Program_18 {
    public static void main(String []args)
    {
        int num1=10,num2=11,digit,mul=0,factor=1;
        
        while(num2 !=0)
        {
            digit = (int)(num2 % 10);
            if (digit ==1 )
            {
               num1 = num1*factor;
               mul = numproduct((int)num1,(int)mul);
            }
            else 
            {
                num1=num1*factor;
            }
            num2=num2/10;
            factor=10;
            }
        System.out.print("Product of two binary numbers: " + mul+"\n");
        }
        static int numproduct(int num1, int num2)
        {
            int i=0, remainder=0;
            int[] sum = new int[8];
            int num_prod_result=0;
            
            while(num1 !=0|| num2!=0)
            {
                sum[i++] = (num1 % 10 + num2 % 10 + remainder) % 2;
                 remainder = (num1 % 10 + num2 % 10 + remainder) / 2;
                 num1=num1/10;
                 num2=num2/10;  
            }
            if(remainder!=0)
            {
                sum[i++]=remainder;
            }
            --i;
            while(i>=0)
            {
                num_prod_result=num_prod_result*10 + sum[i--];
            }
            return num_prod_result;
        }
    }   

