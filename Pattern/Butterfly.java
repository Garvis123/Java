package Pattern;

public class Butterfly {
    public static void main(String arg[])
    {

        int r=4;

        for(int i=1;i<=r;i++)
        {
          for(int k=1 ;k<=i;k++)
          {
            System.out.print("*");
          }
          for(int j =1;j<=2*(r-i);j++)
          {
            System.out.print(" ");
          }
          for(int k=1 ;k<=i;k++)
          {
            System.out.print("*");
          }
          System.out.println();
        }
      
        for(int i=r;i>=1;i--)
        {
          for(int k=1 ;k<=i;k++)
          {
            System.out.print("*");
          }
          for(int j =1;j<=2*(r-i);j++)
          {
            System.out.print(" ");
          }
          for(int k=1 ;k<=i;k++)
          {
            System.out.print("*");
          }
          System.out.println();
    }
    }
}
