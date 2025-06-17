public class MoveAllxLast {
    public static void MoveAll(String str,String newString,int idx,int count)
    {
        if(idx==str.length())
        {
            for(int i=0;i<=count;i++)
            {
                newString+='x';
            }
            System.out.print(newString);
            return;
        }
   char currChar=str.charAt(idx);
   if(currChar=='x')
   {
     count++;
     MoveAll(str, newString, idx+1, count);
   }
   else
   {
     newString+=currChar;
     MoveAll(str, newString, idx+1, count);
   }
     

    }
    public static void main(String args[])
    {
        String str="axbcxxd";
        String newStr="";
        int idx=0;
        int count=0;
       MoveAll(str,newStr,idx,count);
    }
}
