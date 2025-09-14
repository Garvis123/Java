package TopQuestions;

public class MergeSort {
    public static void Merge(int nums1[],int nums2[],int m,int n)
    {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
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
        
    }
    {

    }
    public static void main(String args[])
    {
        int nums1[]={1,2,4,0,0,0};
        int nums2[]={2,5,6};
        int m=3;
        int n=3;
        Merge(nums1,nums2,m,n);
        // Print the merged array
        for(int i=0; i<m+n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
