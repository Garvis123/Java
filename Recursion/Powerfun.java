public class Powerfun {

    public static int powerfunc(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        return x*powerfunc(x,n-1);
    }

    public static int optimised(int x,int n)
    {
        if(n==0) return 1;
        int halfPower = optimised(x, n/2);
        int halfSqaure= halfPower*halfPower;

        // n is odd
        if(n%2!=0)
{
    halfSqaure=x*halfSqaure;
}

return halfSqaure;


    }
    public static void main(String args[])
    {
     int x=2;
     int n=10;
    //  System.out.print(powerfunc(x,n));
     System.out.print(optimised(x,n));
    }
}
