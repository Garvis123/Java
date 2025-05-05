import java.util.Arrays;

public class Javabasic{
  public static boolean IsPAlindrome(String s)
  {
    int i =0;
    int j=s.length()-1;
   while(i<j)
   {
    if(s.charAt(i)!=s.charAt(j)) return false;
    i++;
    j--;
   }
return true;
  }
       
public static void main(String args[])
{
  String str="babad";
  int count=0;
  for(int i =0;i<str.length()-1;i++)
  {
    for(int j=i+1;j<=str.length();j++)
    {
      if(IsPAlindrome(str.substring(i,j))==true)
      {
      System.out.print(str.substring(i,j)+ " ");
      count++;
      }
    }
  }
}
  
}
