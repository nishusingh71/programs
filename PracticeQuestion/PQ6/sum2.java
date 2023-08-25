package programs.PracticeQuestion.PQ6;

import java.util.Scanner;

public class sum2 {
    public static void maxSumArray(int nums[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[nums.length];
        //calculate prefix Arrays
         prefix[0]=nums[0];
        for(int i=1;i<prefix.length;i++){
           prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println(maxSum);
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
        maxSumArray(nums);
        s.close();
    }
}
