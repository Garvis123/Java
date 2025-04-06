import java.util.Scanner;

public class Javabasic {

  public static int product(int a ,int b)
  {
     return a*b;
  }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("enter number a: ");
       int a = sc.nextInt();
       System.out.print("enter number b: ");
       int b = sc.nextInt();
      int p= product(a,b);
      System.out.print("Product is: " + p);
  }
}
