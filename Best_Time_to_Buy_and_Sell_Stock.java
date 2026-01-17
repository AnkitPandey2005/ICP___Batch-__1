import java.util.Scanner;

public class Best_Time_to_Buy_and_Sell_Stock {
    static void main() {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=in.nextInt();
       }
       int z=MaximumProfit(arr);
       System.out.println(z);
    }
    public static int MaximumProfit(int[] prices){
        int buyPrice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxprofit=Math.max(maxprofit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxprofit;
    }
}

/*
* Input: prices = [7,1,5,3,6,4]
Output: 5
* */
