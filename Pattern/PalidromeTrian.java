package Pattern;

public class PalidromeTrian {
    public static void main(String arg[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
         // for spaces
         for(int j=1;j<=n-i;j++)
         {
           System.out.print(" ");
         }
         // for 1 pyramid
         for(int j=i;j>=1;j--)
         {
           System.out.print(j);
         }
         // for 2 pyramid
         for(int j=2;j<=i;j++)
         {
     System.out.print(j);
         }   
          System.out.println();
    }

    }
     }

