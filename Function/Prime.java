package Function;

import java.util.Scanner;

public class Prime {

    public static boolean prime(int n)
    {
        boolean isPrime = true; 
      for(int i=2;i<=n-1;i++)
      {
        if(n%i==0)
        {
            isPrime=false;
            break;
        }
      }
      return isPrime;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
     boolean q= prime(n);
     System.out.print(q);
    }
}
