package Array;

public class majorityelem {
    public static int major(int nums[])
    {
        int count=0;
        int cand=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                cand=nums[i];
            }
            if(cand==nums[i])
            {
                count++;
            }
        }
        return cand;
    }
    public static void main(String args[])
    {
        int nums[]={7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.print(major(nums));
    }
}
