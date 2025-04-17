package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rotate {
    public static void main(String args[])
    {
        int nums[]={1,2,3,4,5,6,7};
        int key=3;
       System.out.print(Arrays.toString(rotate(nums,key)));
    }
    public static int[] rotate(int nums[],int key)
    {
        
        int n = nums.length;
         key=key%n;
       reverse(nums,0,n-1);
       reverse(nums,0,key-1);
       reverse(nums,key,n-1);
       return nums;
    }
    public static void reverse(int nums[],int start,int end)
    {
        int n = nums.length;
        while(start<=end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
