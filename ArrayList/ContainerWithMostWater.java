package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {

    // public static int storeWater(ArrayList<Integer> heigth)
    // {
    //     int maxWater=0;
    //     for(int i=0;i<heigth.size();i++)
    //     {
    //         for(int j=i+1;j<heigth.size();j++)
    //         {
    //             int h=Math.min(heigth.get(i),heigth.get(j));
    //             int w=j-i;
    //             int currWater=h*w;
    //             maxWater=Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }

    public static int storeWater(ArrayList<Integer> height)
    {
          int maxWater=0;
          int i=0;
          int j=height.size()-1;
          while(i<j){
             int ht=Math.min(height.get(i),height.get(j));
             int wd=j-i;
             int currWa=ht*wd;
             maxWater=Math.max(maxWater, currWa);
             if(height.get(i)<height.get(j))
             {
                i++;
             }
             else{
                j--;
             }
          }
          return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
      System.out.print(storeWater(list));
    }
}
