import java.util.Scanner;
public class Nikhil
{
      public static void main(String[] args)
      {
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter the number of row ");
           int n=sc.nextInt(); 
           //declaration first outer for loop for print the first number pyramid
           for(int i=1;i<=n;i++)
           {
                //declare inner loop for print the spaces
                for(int j=1;j<=n-i;j++)
                {
                       System.out.print(" ");
                }
                //declare inner loop for print the number
                for(int j=1;j<=i*2-1;j++)
                {
                      //here we print i, here  print same number in a row
                       System.out.print(i);
                }
                System.out.println();
            } 
            //declare second outer loop for printing opposite number pyramid
            for(int i=n-1;i>0;i--)
            {
                  //declare inner loop for print the spaces
                  for(int j=1;j<=n-i;j++)
                  {
                         System.out.print(" ");
                  }
                  //declare inner loop for print the number
                  for(int j=1;j<=i*2-1;j++)
                  {
                         System.out.print(i);
                  }
                  System.out.println();
             }
       }
}