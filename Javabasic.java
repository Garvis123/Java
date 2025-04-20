
public class Javabasic{
    public static int find(int num[])
    {
        int sum=0;
        int maxsum=num[0];
        for(int i=0;i<num.length;i++)
        {
            sum=sum+num[i];
            if(maxsum<sum)
            {
                maxsum=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
      return maxsum;
    }

public static void main(String args[])
{
    int num[]={-2, -3, -7, -2, -10, -4};
    System.out.print(find(num));
    
}
  
}
