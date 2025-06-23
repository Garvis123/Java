package BackTracking;

public class Basic {
    public static void printArr(int n)
    {
        if(n==0)
        {
            return;
        }
        printArr(n-1);
        System.out.println(n + " ");
       System.out.print(n-2 + " ");

    }
    public static void main(String args[])
    {
        printArr(5);
    }
}
