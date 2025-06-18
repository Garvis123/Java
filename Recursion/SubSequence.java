public class SubSequence {
    public static void Sequence(String str,int idx,String newStr)
    {
        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }
      char charCurr=str.charAt(idx);
        Sequence(str, idx+1, newStr+charCurr);
        Sequence(str, idx+1, newStr);
    }
    public static void main(String args[])
    {
        Sequence("abc",0,"");
    }
}
