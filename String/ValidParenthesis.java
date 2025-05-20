package String;

public abstract class ValidParenthesis {
    public static boolean Validparan(String s)
    {
        while(true)
        {
            if(s.contains("()"))
            {
                s=s.replace("()", "");
            }
            else if(s.contains("{}"))
        {
                s=s.replace("{}", "");
        }
        else if(s.contains("[]"))
        {
           s= s.replace("[]", "");
        }
        else 
        {
             return  s.isEmpty();
        }
        }
    }
    public static void main(String args[])
    {
        String s = "({}]";
        System.out.print(Validparan(s));
    }
}
