package String;

public class Shortestpath {
    public static float isShortestPath(String n)
    {
        int x=0;
        int y=0;
        for(int i=0;i<n.length();i++)
        {

            char dir=n.charAt(i);
            if(dir=='N')
            {
                y++;
            }
            else if(dir=='E')
            {
                x++;
            }
            else if(dir =='S')
            {
              y--;
            }
            else if(dir == 'W')
            {
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float) Math.sqrt(X2+Y2);

    }
    public static void main(String args[])
    {
        String path="WNEENESENNN";
        System.out.print(isShortestPath(path));
    }
}
