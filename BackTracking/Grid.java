package BackTracking;

public class Grid {

    public static int getWays(int i,int j,int n,int m)
    {
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        else if(i==n || j==m)
        {
            return 0;
        }
       int w= getWays(i+1, j, n, m);
       int a= getWays(i, j+1, n, m);
        return w+a;
    }
    public static void main(String args[])
    {
        int n = 3;
        int m =3;
        System.out.print( "The number of ways are = " +getWays(0,0,n,m));
    }
}
