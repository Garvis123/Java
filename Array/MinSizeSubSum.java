package Array;

public class MinSizeSubSum {

public static int minSubArraySum(int target,int[] nums)
{
    int minSubArrayLen=Integer.MAX_VALUE;
    int currSum=0;
    // two pointer sliding window
    int low=0;
    int high=0;

    while(high < nums.length)
    {
        //  find the current sum and increase window size
        currSum+=nums[high];
        high++;

        // try to reduce window size

        while (currSum >= target)
        {
            int currentWindowSize=high-low;

            // update minimum length of window

            minSubArrayLen= Math.min(currentWindowSize, minSubArrayLen);
            currSum-=nums[low];
            low++;
        }
    }
    return minSubArrayLen== Integer.MAX_VALUE ? 0: minSubArrayLen;

}    
    public static void main(String args[])
{
    int target=7;
    int nums[]={2,3,1,2,4,3};
    minSubArraySum(target,nums);
}
}
