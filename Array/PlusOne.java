package Array;

import java.util.Arrays;

public class PlusOne {
        public static int[] find(int digits[])
    {
        int n=digits.length;
        for(int i=n-1;i>=0;i++)
        {
            if(digits[i]<9)
            {
                digits[i]++;
return digits;      
            }
            digits[i]=0;
        }
        int newNum[]=new int[n+1];
 newNum[0]=1;
 return newNum;
    }
   
     

public static void main(String args[])
{
    int num[]={1,2,3};
    System.out.print(Arrays.toString(find(num)));
    
}
  
}
