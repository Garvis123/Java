package JavaBasic;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int f=0;
        int l=1;
        
        for(int i=0;i<=a;i++)
        {
            System.out.print(f);
        int sum=f+l;
        f=l;
        l=sum;

        }
        
    }
}
