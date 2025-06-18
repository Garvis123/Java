public class Maze {
    
    public static int mazee(int i,int j,int n,int m)
    {
        if(i==n||j==m)
        {
            return 0;
        }
        if(i==n-1 || j==m-1)
        {
            return 1;
        }
         int downwards=mazee(i+1, j, n, m);
         int upwards=mazee(i,j+1,n,m);
         return downwards+upwards;
    }
    public static void main(String args[])
    {
        int n=3;
        int m=3;
        System.out.print(mazee(0,0,n,m));
    }
}
