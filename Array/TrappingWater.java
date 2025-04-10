package Array;

public class TrappingWater {
    public static int water(int height[])
    {
      int n = height.length;
      //1. Calculate left boundary

      int leftBoundary[]=new int[n];
      leftBoundary[0]=height[0];
      for(int i = 1 ;i<n;i++)
      {
      leftBoundary[i]=Math.max(height[i],leftBoundary[i-1]);
      }

    //   2.Calculate right boundary
    int rightBoundary[]=new int[n];
     rightBoundary[n-1]=height[n-1];
     for(int i = n-2;i>=0;i--)
     {
        rightBoundary[i]=Math.max(height[i] ,rightBoundary[i+1]);
     }
    
    // 3.loop
    int trappedWater=0;
    for(int i=0;i<n;i++)
    {
        // waterlevel= min(leftBoundary,rightBoundary);
   int waterlevel = Math.min(leftBoundary[i],rightBoundary[i]); 
   trappedWater +=waterlevel-height[i];
    }
    return trappedWater;
}
    public static void main(String args[])
    {
        int num[]={4,2,0,6,3,2,5};
       int q= water(num);
        System.out.print(q);
    }
}
