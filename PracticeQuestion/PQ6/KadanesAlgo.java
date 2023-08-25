package programs.PracticeQuestion.PQ6;

import java.util.Scanner;

public class KadanesAlgo {
    public static void kandanes(int nums[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum=currSum+nums[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
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
        kandanes(nums);
        s.close();
    }
}
