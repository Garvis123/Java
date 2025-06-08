package BitManipulation;

import java.util.BitSet;

public class evenOddCheck {
    public static void Evenodd(int n)
    {
         if((n & 1)==0)
          {
         System.out.print("even number");
          }
          else
          {
            System.out.print("odd number");
          };
    }

    public static int getVal(int n,int i)
    {
        int bitMask=1<<i;
        if((n & bitMask)==0)
        {
            return 0;
        }
        else 
        {
            return 1;
        }
    }

    public static int ClearIthBi(int n ,int i)
    {
      int bitMask=~(1<<i);
      return n & bitMask;
    }

    public static int SetIthBit(int n ,int i)
    {
        int bitMask=1<<i;
        return n | bitMask;
    }

    public static int UpdateIthBi(int n , int i , int newBit)
    {
        // if(newBit ==0)
        // {
        //     return ClearIthBi(n,i);
        // }
        // else
        // {
        //     return SetIthBit(n,i);
        // }
        n=ClearIthBi(n,i);
        int bitMask = newBit << i;
        return n|bitMask;
    }

    public static int ClearLastIbits(int n , int i)
    {
      int bitMask=(~0)<<i;
      return n & bitMask;
    }

    public static int Clearran(int n , int i,int j)
    {
        int a = ((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n & bitMask;
    }

    public static void PowerOfTwo(int n )
    {
        System.out.print((n&n-1)==0);
    }

    public static int counSetBits(int n)  //amazon
    {
        int count=0;
        while(n>0)
        {
            if((n&1)!=0)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static int fastExpo(int a ,int n)
    {
        int ans=1;
        while(n<=0)
        {
            if((n&1)!=0)
            {
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;

        }
        return ans;
    }

    public static int SingleNumber( int num[])
    {
    int value=0;
    for(int i=0;i<num.length;i++)
    {
          value=value^num[i];
    }
    return value;

    }


    public static void main(String args[])
    {
        //  Evenodd(4);
        // getVal(10,2);
    //    System.out.print(SetIthBit(10, 2));
// System.out.print(ClearIthBi(10, 2));
//  System.out.print(UpdateIthBi(10, 2,1));
//  PowerOfTwo(5);
// counSetBits(10);
// int num[]={4,1,1,2,2};
// System.out.print(SingleNumber(num));
    }
}
