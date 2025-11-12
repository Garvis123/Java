package TopQuestions;

public class RemoveDupli {

    public static int Duplicate(int nums[])
    {
       int k=0;
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i]!=nums[k])
        {
            k++;
            nums[k]=nums[i];
        }
       }
       return k+1;
    }
    public static void main(String[] args) {
        int  nums[] ={1,1,2};
        System.out.print(Duplicate(nums));

    }
}
