package TopQuestions;

public class Removeduplitwo {

    public static int duplicate(int nums[])
    {
        int k=1;
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
           if(nums[i]==nums[i-1])
           {
            count++;
           }
           else
           {
            count=1;
           }
           if(count >=2)
           {
            nums[k]=nums[i];
            k++;
           }
        }

        return k+1;
    }
    public static void main(String args[])
    {
        int nums[]={1,1,1,2,2,3};
        System.out.print(duplicate(nums));
    }
}
