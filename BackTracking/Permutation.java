package BackTracking;

public class Permutation {
public static void printPer(String str,String Newstr)
{
    if(str.length()==0)
    {
        System.out.println(Newstr);
        return;
    }

    for(int i=0;i<str.length();i++)
    {
        char curr=str.charAt(i);
        // abcde = ab+de --> remove c;
        String New=str.substring(0, i) + str.substring(i+1);
        printPer(New, Newstr+curr);
    }


}
     public static void main(String args[])
    {
        String str="abc";
        printPer(str,"");
    }
}

