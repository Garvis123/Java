public class RemovingDuplicate {
    public static void RemoveDuplicate(String str,int idx,StringBuilder newStr,boolean map[])
    {
     //base 
     if(idx==str.length())
     {
        System.out.print(newStr);
        return;
     }
     
     //kam
     char currChar=str.charAt(idx);
     if(map[currChar - 'a']== true)
     {
        //duplicate
        RemoveDuplicate(str, idx+1, newStr, map);
     }
     else
     {
        map[currChar - 'a'] = true;
        RemoveDuplicate(str, idx+1, newStr.append(currChar), map);
     }

    }


    public static void main(String args[])
    {
        String str="appnnacollege";
        RemoveDuplicate(str,0,new StringBuilder(),new boolean[26]);
    }
}
