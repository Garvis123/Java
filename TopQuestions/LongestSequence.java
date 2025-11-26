package TopQuestions;
import java.util.*;
public class LongestSequence {

    public static int sequence(int nums[])
    {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
      int  longest=1;
int current=1;
    // Duplicate
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]==nums[i-1])
            {
        continue;
            }
//consecutive
if(nums[i]==nums[i-1]+1)
{
    
}

    }
    }

    public static void main(String args[])
    {
        int nums[]={100,4,200,1,3,2};
        sequence(nums);
    }
}
