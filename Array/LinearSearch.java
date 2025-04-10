package Array;

import java.util.Scanner;

public record LinearSearch() {

   public static int canteen(String menu[],String key)
   {
      for(int i=0;i<menu.length;i++)
      {
        if(menu[i]==key)
        {
         return i;
        }
      }
      return -1;
   }
   public static void  main(String args[])
   {
     String menu[]={"samosa","coke","chai","biscut","chips"};
     String key ="chai";
   int user = canteen(menu,key);
   if(user==-1){System.out.print("Not Found");}
   else{System.out.print(key+ " is at" + " " + user);}
   }

}
