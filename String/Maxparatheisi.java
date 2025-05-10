package String;

public class Maxparatheisi {
    public static int maxDepth(String s)
    {
       int max=0;
       int curr=0;
       for(int i=0;i<s.length();i++)
       {
          if(s.charAt(i) == '(')
          {
            curr++;
         max=Math.max(curr,max);
          }
          else if(s.charAt(i) == ')')
          {
            curr--;
               
          }
       }
       return max;
    }
    public static void main(String args[])
    {
    String s = "(1+(2*3)+((8)/4))+1";
    System.out.print(maxDepth(s));
    }
}
