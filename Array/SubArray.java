package Array;

public class SubArray {
    public static int Subrray(int num[])
    {
     int product=1;
     int maxp=num[0];
     for(int i=0;i<num.length;i++)
     {
      product=product*num[i];
      if(product>maxp)
      {
        maxp=product;
      }
      if(product<0)
      {
        product=0;
      }
     }
     return maxp;
      }
    public static void main(String args[])
    {
        int num[]={4, 5, 3, 7, 1, 2};
        System.out.print(Subrray(num));
    }
}
