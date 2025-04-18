import java.util.Arrays;

public class Javabasic{

//   public static void search(int nums[])
//   {
//    for(int i=0;i<nums.length;i++)
//    {
//      for(int j=0;j<nums.length;j++)
//      {
//         if(nums[j]%2==0)
//         {
//            System.out.print(nums[j]);
//         }
//      }
//    }
//   }
    
public static void main(String args[])
{
    int nums[]={0, 2, 3, 1, 4};
  for(int i=0;i<nums.length;i++)
  {
    if(nums[i]==i)
    {
      System.out.print(i+1);
    }

  }
}
}