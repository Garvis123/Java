package Array;

public class BuyandSell {
    public static int BuyandSellStocks(int prices[])
    {
int buyprices=Integer.MAX_VALUE;
int maxProfit=0;
for(int i=0;i<prices.length;i++)
{
    if(buyprices<prices[i]){
        int profit=prices[i] - buyprices;
        maxProfit= Math.max(maxProfit,profit);
    }
    else
    {
        buyprices=prices[i];
    }
}
return maxProfit;
    }
    public static void main(String args[])
    {
int prices[]={7,1,3,5,6,4};
System.out.print(BuyandSellStocks(prices));
    }
}
