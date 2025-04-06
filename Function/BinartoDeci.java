package Function;

public class BinartoDeci {
    public static void BinarytoDeci(int num)
    {
        int pow=0;
        int decim=0;
        while(num >0)
        {
            int last = num%10;
            decim=decim+(last*(int) Math.pow(2,pow));
            pow++;
            num=num/10;
        }
        System.out.print(decim);
    }
    public static void main(String args[])
    {
       BinarytoDeci(101);
    }
}
