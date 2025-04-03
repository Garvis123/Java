package JavaBasic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b=a;
        int sum=0;
        while(a>0)
        {
            int last = a%10;
            last = last*last*last;
            sum=sum+last;
            a=a/10;
        }
        if(b==sum)
        {
        System.out.println("it is armgstrong");
        }
        else
        {
            System.out.println("it is not armgstrong");
        }
        
    }
}
