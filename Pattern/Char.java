package Pattern;

public class Char {
    public static void main(String arg[])
    {
        int n =5;
        char ch='a';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
