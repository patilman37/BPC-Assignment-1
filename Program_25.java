package Assignment1;

import java.util.Scanner;

public class Program_25 
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  long octal, decimalNumber = 0, j = 1, remainder;
  System.out.print("Input a octal number: ");
  octal = sc.nextLong();

  while (octal != 0) 
  {
   remainder = octal % 10;
   decimalNumber = decimalNumber + remainder * j;
   j = j * 8;
   octal = octal / 10;
  }
  System.out.println("Decimal Number: " + decimalNumber);
 }
}

