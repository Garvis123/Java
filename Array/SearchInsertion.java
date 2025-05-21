package Array;

public class SearchInsertion {
    public static void main(String args[])
    {
        int nums[]={1,3,5,6};
        int target=7;
       for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target || target < nums[i])
            {
                System.out.print(i);
            }
        }
        System.out.print(nums.length);
    }
}
