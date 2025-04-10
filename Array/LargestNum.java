package Array;

import java.util.*;

public class LargestNum {
    // agar minumum print karvana ho to MAX_value ka use krenge aur largest>nm[i]
    public static int num(int num[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(largest<num[i])
            {
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String args[])
    {
int nums[]={1,3,4,6,8};
int n = num(nums);
System.out.println(n);
    }
}
