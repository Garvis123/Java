package String;
public class IntegerToRoman {
    public static String intTRoman(int num)
    {
       int[] nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};
       String cha[]={"M", "CM", "D", "CD","C","XC","L","XL","X", "IX","V","IV","I"};
       StringBuilder sb=new StringBuilder("");
       for(int i=0;i<nums.length;i++)
       {
        while(num>=nums[i])
{
    num=num-nums[i];
     sb.append(cha[i]);
}
       }
       return sb+"";
    }
    public static void main(String args[])
    {
           int num=3749;
           System.out.print(intTRoman(num));
    }
}
