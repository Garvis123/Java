package JavaBasic;

import java.util.Scanner;


public class Collatz {
    public static void main(String arg[])
{
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    while(a!=1)
    {
        System.out.print(a + " ");
        if(a%2==0)
        {
            a=a/2;
        }
        else
        {
            a = ( 3 * a ) + 1;
           
        }
    }
    System.out.println(a);
}
}
