package Function;

public class DecimtoBina {
    public static void Bina(int n)
    {
      int pow=0;
      int deci=0;
      while(n>0)
      {
        int rem = n%2;
        deci=deci+(rem * (int) Math.pow(10, pow));
        pow++;
        n=n/2;
      }
      System.out.print(deci);
    }
    public static void main(String args[])
    {
       Bina(11);
    }
}
