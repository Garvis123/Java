package Function;

import java.util.Scanner;

public class Binomial {
 
    public static int fact(int n )
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }

    public static int bino(int n ,int r)
    {
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        return a/(b*c);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a ");
        int a = sc.nextInt();
        System.out.println("Enter n ");
        int n=sc.nextInt();
        System.out.println("Enter r ");
        int r=sc.nextInt();
     int p= fact(a);
     int q=bino(n,r);
     System.out.println("Factorial is : " + p );
     System.out.println("Binomial is : " + q);

    }
 
    }

