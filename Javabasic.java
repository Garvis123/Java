public class Javabasic {

    public static int Power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        int halfPower=Power(x, n/2);
        int sqaurePow=halfPower*halfPower;
        if(n%2!=0)
        {
            sqaurePow = x*sqaurePow;
        }
        return sqaurePow;
    }
    public static void main(String args[])
    {
       System.out.print(Power(2,10));
    }
}
