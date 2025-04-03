package JavaBasic;

import java.util.Scanner;

public class SumOfDigi {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        while(a>0)
        {
            int last=a%10;
            sum=sum+last;
            a=a/10;
        }
        System.out.println(sum);
    }
}
