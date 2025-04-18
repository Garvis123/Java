package Array;

public class missingnumber {
    public static void main(String args[])
    {
        int num[]={0, 1, 2, 4, 5, 6};
        int n=num.length;
        int sum=0;
         for(int i=0;i<n;i++)
         {
            sum=sum+num[i];
         }
         int actual=(n*(n+1))/2;
         
         int left = actual-sum;
         System.out.println(left);
        //  System.out.println(sum);
        //  System.out.print(actual);

    }
}
