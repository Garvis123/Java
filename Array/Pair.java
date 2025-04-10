package Array;

public class Pair {
    public static void pairs(int num[])
    {
      for(int i =0;i<num.length;i++)//2,4,6,8
      {
        int curr=num[i];
        for(int j=i+1;j<num.length;j++)//4,6,8
        {
System.out.print("(" + curr + "," +num[j] + ") ");
        }
        System.out.println();
      }
    }

    public static void main(String args[])
    {
int num[]={2,4,6,8,10};
pairs(num);
    }
}
