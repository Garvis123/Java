package Function;


public class PrimeRange {
    public static boolean isPrime(int n)
    {
       boolean Isprime=true;
       for(int i=2;i<=n-1;i++)
       {
        if(n%i==0)
        {
            Isprime=false;
            break;
        }
    }
    return Isprime;
    }

    public static void Range(int n)
    {
        for(int i=2;i<=n-1;i++)
        {
            if(isPrime(i))
            {
                System.out.print(  i );
            }
        }
        System.out.println();
    }
   public static void main(String args[])
   {

  Range(10);
   
   }
}

