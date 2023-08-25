package programs.PracticeQuestion.PQ6;

import java.util.Scanner;

public class MaxProfit {
    public static int maxProfit(int [] prices){
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(buy<prices[i]){
                profit=Math.max(prices[i]-buy,profit);
            }else{
                buy=prices[i];
            }
        }
        return profit;
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
        System.out.println(maxProfit(nums));
        s.close();
    }
}
