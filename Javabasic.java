
public class Javabasic {

  public static void main(String args[]) {
   int arr[]={2,7,11,15};
   int s=9;
   for(int i=0;i<arr.length;i++)
   {
    for(int j=0;j<=arr.length;j++)
    {
         if(arr[i]+arr[j]==s)
         {
            System.out.println(i+ ", " + j);
         }
    }
   }
}
}
