public class LastOcc {
    public static int LastOc(int arr[],int key,int i)
    {
        if(i==arr.length-1)
        {
            return -1;
        }
     int f= LastOc(arr, key, i+1);
      if(f==-1 & arr[i]==key)
      {
        return i;
      }
      return f;
    }
    public static void main(String args[])
    {
         int arr[]={1,2,4,5,6};
        int key=4;
        int i=0;
        System.out.print(LastOc(arr,key,i));
    }
}
