public class FisrtLastOcc {
    public static int first=-1;
    public static int last=-1;

    public static void FirstOc(String str,int idx)
    {
        if(idx==str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar=='a')
        {
            if(first==-1)
            {
                first=idx;
            }
            else
            {
                last=idx;
            }
        }
        FirstOc(str, idx+1);

    }
    public static void main(String args[])
    {
        String str= "aabcdab";
        int idx=0;
        FirstOc(str,idx);

    }
}
