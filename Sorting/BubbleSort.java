package Sorting;

public class BubbleSort {
    public static void Bubble(int arr[])
    {
      for(int i =0;i<arr.length-1;i++)
      {
        int swap=0;
        for(int j=0;j<arr.length-1-i;j++)// here we used arr.length-1-i isliye coz last element apni jagah pe hai isliye loop kam hota jata h 
        {
          if(arr[j]>arr[j+1])
          {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            swap++;
          }
        }
        System.out.print(swap + " ");
    }
    }

    public static void prin(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
         System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[]={5,2,1,4,3};
        Bubble(arr);
        prin(arr);
    }
}
