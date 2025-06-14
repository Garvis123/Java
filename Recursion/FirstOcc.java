public class FirstOcc {

    public static int FirstOc(int arr[],int key,int i)
    {
        if(i==arr.length) return -1;
        if(arr[i]==key) return i;
        return FirstOc(arr, key, i+1);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,4,5,6};
        int key=4;
        int i=0;
        System.out.print(FirstOc(arr,key,i));

    }
}
