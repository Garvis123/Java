import java.util.Arrays;

public class Javabasic{
       
public static int[] rotate(int arr[],int key)
{
   for(int i=0;i<arr.length;i++)
   {
    int n = arr.length;
     reverse(arr, 0, n-1);
  reverse(arr,0,key-1);
       reverse(arr,key,n-1);

   }
   return arr;
}
public static void reverse(int arr[],int i ,int j)
{
   while(i<=j)
   {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
   }
}
public static void main(String args[])
{
  int[] arr = {1, 2, 3, 4, 5};
  int rotate=1;
  rotate(arr,rotate);
  for(int i=0;i<arr.length;i++)
  {
    System.out.print(arr[i]);
  }
}

  
}
