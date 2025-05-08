package String;

public class RemoveParanthesis {
    public static void main(String args[])
    {
      String sb="(()())(())(()(()))";
        StringBuilder ans=new StringBuilder();
        int count=0;
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(') {
                if (count > 0) {
                    ans.append(ch);
                }
                count++;
            } else if (ch == ')') {
                count--;
                if (count > 0) {
                    ans.append(ch);
                }
            }
        }
       System.out.print(ans.toString());
    }
}
