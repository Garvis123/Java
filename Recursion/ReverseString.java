public class ReverseString {

    public static void reverse(String str,int idx)
    {
        if(idx==0)
        {
            
            System.out.print(str.charAt(idx));
            // str=str.trim();
            return;
        }
        System.out.print(str.trim().charAt(idx));
        // str=str.trim();
        reverse(str, idx-1);
    }
    public static void main(String args[])
    {
      String str="abcd";
      int idx=str.length()-1;
      reverse(str,idx);
    }

}
