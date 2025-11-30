package TopQuestions;


public class DailyTemp {

    public static  int[] change(int temp[])
    {
        int arr[]= new int[temp.length];
        
        for(int i=0;i<temp.length;i++)
        {
          for(int j=i+1;j<temp.length;j++)
          {
            if(temp[j]>temp[i])
            {
                arr[i]=j-i;
                break;
            }
          }
        }
        return arr;
    }
    public static void main(String args[])
    {
        int temp[]={73,74,75,71,69,72,76,73};
       int ans[]= change(temp);
       for(int i=0;i<ans.length;i++)
       {
        System.out.print(ans[i] + " ");
       }

    }
}
