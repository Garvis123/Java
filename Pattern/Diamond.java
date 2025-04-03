package Pattern;

public class Diamond {
   public static void main(String arg[])
   {
    int n=5;
    for(int i =1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
         if(i%2!=0)
         {
            System.out.print("*");
         }
         else
         {
            System.out.print(" ");
         }

        }
        

        System.out.println();
    }
   }
}
