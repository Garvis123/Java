package String;

public class CountsubString {
    public static void main(String args[])
    {
        String i="zzzzz";
        int n = i.length();
        int length=0;
        int result=0;
        for(int j=0;j<n;j++)
        {
if(j>0 && i.charAt(j)==i.charAt(j-1))
{
    length +=1;
}
else 
{
    length=1;
}
result=result+length;
        }
System.out.print(result);
    }
}
