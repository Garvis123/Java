public class SumOfNatural {

    public static int SumofNat(int n)
    {
        
        if(n==1)
        {
            return 1;
        }
        int fn=SumofNat(n-1);
        int sn=n+fn;
        return sn;
      
    }
    public static void main(String args[])
    {
        int n=5;
        System.out.print(SumofNat(n));
    }
}
