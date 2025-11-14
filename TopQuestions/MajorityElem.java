package TopQuestions;

public class MajorityElem {

    public static void majority(int nums[])
    {
        int candidate=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
           if(nums[i]==candidate)
           {
            count++;
           }
           else
           {
            count--;
            if(count==0)
            {
                candidate=nums[i];
                count=1;
            }
           }
        }
        System.out.print(candidate);
    }
    public static void main(String args[])
    {
        int nums[]={3,2,3};
        majority(nums);
    }
}
