import JavaBasic.Palidrome;

public class Javabasic {  
   public static void Palidromee(String a)
   {
      int i =0;
      int j=a.length()-1;
      for(int k=0;k<j;k++)
      {
         
         if(a.charAt(i)==a.charAt(j))
         {
            i++;
            j--;
         }
         else 
         {
            break;
         }
         System.out.print("It is a palidrome");
      }
   } 
   public static void main(String args[])
   {
    String a="anna";
    Palidromee(a);
   }
}
