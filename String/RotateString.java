package String;

public class RotateString {
    public static boolean reverse(String s, String goal)
    {
      StringBuilder i=new StringBuilder("abcde");
      StringBuilder j=new StringBuilder("cdeab");
     StringBuilder u=new StringBuilder(i.reverse()+"");
     String a="";
      for(int k=2;k<i.length()-1;k++)
      {
        a=u.reverse()+"";
      }
      if(a==goal)
      {
         return true;
      }
      System.out.print(a);
return false;
    }
    public static void main(String args[])
    {
String s="abcde";
String goal="cdeab";
System.out.print(reverse(s,goal));
    }
}
