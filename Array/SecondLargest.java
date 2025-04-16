package Array;

public class SecondLargest {
    public static void main(String args[])
    {
        int matrix[]={1,2,3,4,5};
        int min=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i]>min)
            {
                min=matrix[i];
            }
        }
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i]>smax && matrix[i]!=min)
            {
                smax=matrix[i];
            }
        }
        System.out.print(smax);
    }
}
