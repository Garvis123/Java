package Array;

public class GasStation {
    public static int canCompleteCircuit(int gas[],int cost[])
    {
        int totalgas=0;
        int totalcost=0;
        // total cost aur price nikal ke ye dikha ki agar cost jyda hai too dikat wali batt hai starting check hai sort of
        for(int i=0;i<gas.length;i++)
        {
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        // yaha check kiya hai
        if(totalcost > totalgas)
        {
            return -1;
        }
//  yaha basically check agar kunsa route lena chaiya jisse gas bache aur pura loop bann jaye 
        int currentgas=0;int startindex=0;
        for(int i=0;i<gas.length;i++)
        {
           currentgas+=gas[i]-cost[i];
           if(currentgas<0)
           {
            startindex=i+1;
            currentgas=0;
           }
        }
        return startindex;
    }
    public static void main(String args[])
    {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
       System.out.print(canCompleteCircuit(gas,cost));
    }
}
