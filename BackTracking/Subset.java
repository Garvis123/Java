package BackTracking;

public class Subset {
    public static void printSub(String str,int i,String newStr)
    {
        if(i==str.length())
        {        
            System.out.println(newStr + " ");
          return  ;
        }
        char curr=str.charAt(i);
        printSub(str,i+1 ,newStr+curr);
        printSub(str,i+1,newStr);
        
    }
    public static void main(String args[])
    {
        String str="abc";
        printSub(str,0,"");
    }
}
