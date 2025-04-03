package JavaBasic;
import java.util.*;

public class Palidrome {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int reverse=0;
        int b=a;
        
        while(a>0)
        {
            int last=a%10;
            reverse=(reverse*10)+last;
            a=a/10;
        }
        if(b==reverse)
        {
            System.out.println("It is palidrome ");     
        }
        else
        {
          System.out.println("it is not a palidrome ");
        }
        // System.out.println("reverse of a numbe is:" + reverse);

    }
}
