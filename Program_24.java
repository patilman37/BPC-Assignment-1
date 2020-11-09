package Assignment1;
import java.util.Scanner;
public class Program_24 {
 public static void main(String[] args) 
 {
  int[] octnum = new int[100];
  int i = 1, j , rem,quot, dec = 0, bin,bin1;
  Scanner in = new Scanner(System.in);
  System.out.print("Input a Binary Number: ");
  bin = in.nextInt();
  
  
  while (bin > 0) {
   rem = bin % 10;
   dec = dec + rem * i;
   i = i * 2;
   bin = bin / 10;
  }
   i = 1;
   quot=dec;
   
  while (quot > 0) {
   octnum[i++]=quot%8;
   quot=quot/8;
  }
  System.out.print("octal value of "+bin+" is ");
  for (j = i - 1; j > 0; j--)
  {
   
    System.out.print(octnum[j]);
  
  }
  System.out.print("\n");
 }
}

