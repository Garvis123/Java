package ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
public class arrayList {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList <Boolean> list2=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(5);
        int MinValue=Integer.MIN_VALUE;
       
        // System.out.print(list);
        
        // for(int i=0;i<list.size();i++)
        // {
        //     if(MinValue<list.get(i))
        //     {
            //         MinValue=list.get(i);
        //     }
        // }
        // System.out.print(MinValue);
        
        // Collections.sort(list); ascending order sort 
        Collections.sort(list,Collections.reverseOrder());
        System.out.print(list);
    }
}
