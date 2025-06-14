public class factorial {

    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fn=fact(n-1);
        int fac=n*fn;
        return fac;

    }
    public static void main(String args[])
    {
        int n =5;
       System.out.print( fact(n));
    }

}
