package Array;

public class BinarySearch {
    // sorted array
    public static int search(int num[],int key)
    {
       int start=0;
       int end = num.length-1;
       while(start <=end)
       {
           int mid=(start+end)/2;
          if(num[mid]==key)
          {
            return mid;
          }
          if(num[mid]<key) // left
          {
              start=mid + 1;
          }
          else{
            end=mid-1;
          }
       }
       return -1;
    }
    public static void main(String args[])
    {
      int num[]={10,20,30,40,50,60,70};
      int key=20;
     System.out.print(search(num,key));
    }
}
