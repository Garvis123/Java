public class TowerOfHnanoi {
    public static void TowerOfHnano(int n,String src,String help,String dest)
    {
        if(n==1)
        {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        TowerOfHnano(n-1, src, dest, help);
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        TowerOfHnano(n-1, help, src, dest);
    }
    public static void main(String args[])
    {
        int n=2;
        TowerOfHnano(n,"S","H","D");
    }
}
