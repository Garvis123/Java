package String;

public class FirstOcc {
    public static int strStr(String hayString,String needle)
    {
      return hayString.indexOf(needle);
    }
    public static void main(String args[])
    {
        String haystack = "hello";
        String needle = "ll";
        System.out.print(strStr(haystack,needle));
    }
}
