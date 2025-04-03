package JavaBasic;

import java.util.Scanner;

public class Reverse {
   public static void main(String arg[])
   {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int reverse=0;
      while(a>0)
      {
        int last=a%10;
        reverse=(reverse*10)+last;
        a=a/10;
      }
      System.out.println("reverse is: " + reverse);
   }
}
