package Pattern;


public class FloyidTrian {
    public static void main(String arg[])
    {
        // Floyid`s triangle 

        // int n = 5;
        // int num=1;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //    System.out.print(num + " ");
        //    num++;
        //     }
        //     System.out.println();
        // }

        // 0 1 Triangle 
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
               if((i+j) % 2==0)
               {
                System.out.print(" " + 1);
               }
               else
               {
                System.out.print(" " + 0);
               }

            }
            System.out.println();
        }
        
    }
}
