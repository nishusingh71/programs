package programs.PracticeQuestion.PQ6;

import java.util.Scanner;

public class BuyAndSellStocks {
     public static  int buyAndSellStock(int prices[]) {
            int buyPrices=Integer.MAX_VALUE;
            int maxProfit=0;
            for(int i=0;i<prices.length;i++){
                if(buyPrices<prices[i]){
                    int profit=prices[i]-buyPrices;
                    maxProfit=Math.max(maxProfit,profit);
                }else{
                    buyPrices=prices[i];
                }
            }
            return maxProfit;
        }
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of Elements: ");
        int n=s.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter elements "+i+"-> ");
            nums[i]=s.nextInt();
        }
        System.out.println(buyAndSellStock(nums));
        s.close();
        }
         
    
}
