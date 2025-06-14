public class fibonacii {

    public static int fibonaci(int n)
    {
        if(n==1) return 1;
        if(n==2) return 2;
       int a= fibonaci(n-1);
       int b= fibonaci(n-2);
       return a+b;

    }
    public static void main(String args[])
    {
        int n=4;
        System.out.print(fibonaci(n));
    }
}
