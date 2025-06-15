public class TilingProblem {

    public static int titlingPrlm(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        int fn1=titlingPrlm(n-1); // vertical
        int fn2=titlingPrlm(n-2); //horizontal
        return fn1+fn2;
    }
    public static void main(String args[])
    {
        System.out.print(titlingPrlm(4));
    }
}
