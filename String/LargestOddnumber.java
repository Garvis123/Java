package String;
public class LargestOddnumber {
    //input-"1234"
    //output-"123"

    public static String largestOddnumber(String num)
    {
       int len=num.length()-1;
       while(len>=0)
       {
          char ch = num.charAt(len);
        if(ch%2!=0) return num.substring(0, len+1);
       len--;
       }
       return "";
    }
    public static void main(String args[])
    {
        String num="1234";
       System.out.print(largestOddnumber(num));
    }
}
