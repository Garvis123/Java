package TopQuestions;

import java.util.*;

public class ResignValue {
    public static int[] resignValue(int nums[])
    {
        int positive =0;
        int negative=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                arr[positive]=nums[i];
                positive+=2;
            }
            else
            {
                arr[negative]=nums[i];
                negative+=2;
            }
        }
        return arr;
    }
    
    public static void main(String args[])
    {
       int nums[] = {3,1,-2,-5,2,-4};
       resignValue(nums);
    }
}