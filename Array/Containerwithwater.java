package Array;

public class Containerwithwater {
    public static int find(int height[])
    {
        int left=0;
        int right = height.length-1;
       int maxArea=0;
       while(left<right)
       {
        int area = Math.min(height[right],height[left])*(right-left);
        maxArea=Math.max(area,maxArea);
        if(height[left]<height[right])
        {
            left++;
        }
        else
        {
            right--;
        }
       }
       return maxArea;
    }
   
     

public static void main(String args[])
{
    int num[]={1,1};
    System.out.print(find(num));
    
}
  
}
