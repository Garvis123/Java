package String;

public class atoiproblem {
    public static int myAtoi(String s)
    {
        s=s.trim();// for spaces 
        if(s.isEmpty()) return 0;
        int sign=1;
        int i=0;
        long num=0;
        if(s.charAt(i)=='-' || s.charAt(i)=='+')//for sign
        {
     sign=(s.charAt(i)=='-')?-1:1;
     i++;
        }
        int n =s.length();
        
        while(i<n && Character.isDigit(s.charAt(i)))//for digits only 
        {
           num=(num*10)+(s.charAt(i)-'0');
           if(num*sign > Integer.MAX_VALUE)//for rounding off
           {
            return Integer.MAX_VALUE;
           }
           if(num*sign < Integer.MIN_VALUE)
           {
            return Integer.MIN_VALUE;
           }
           i++;
        }
        return (int) (sign*num);

    }
    public static void main(String args[])
    {
        String s=" 42- ";
       System.out.print(myAtoi(s));
    }
}
