package Array;

import java.util.Arrays;

public class MergeSortedar {
    public static void main(String args[])
    {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        int m=3;
        int n=3;
        int i=m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>=0)
        {
if(i>=0 && nums1[i]>nums2[j])
{
    nums1[k]=nums1[i];
i--;
k--;
}
else
{
    nums1[k]=nums2[j];
    j--;
    k--;
}
        }

    System.out.print(Arrays.toString(nums1));
    }
}
