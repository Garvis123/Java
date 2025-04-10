package Array;

public class SubArray {
    public static void Subrray(int num[])
    {
      int curr=0;
      int maxSum=Integer.MIN_VALUE;
      for(int i=0;i<num.length;i++)
      {
        int start=i;
        for(int j=i;j<num.length;j++)
        {
          int end = j;
          curr=0;
          for(int k=start;k<=end;k++)
          {
            System.out.print("("+num[k] + ") ");

            curr=curr+num[k];
          }
          System.out.println(curr);
          if(maxSum < curr)
          {
maxSum=curr;
          }
        }
        System.out.println();
      }
      System.out.println();
    }
    public static void main(String args[])
    {
        int num[]={2,4,6,8,10};
        Subrray(num);
    }
}
