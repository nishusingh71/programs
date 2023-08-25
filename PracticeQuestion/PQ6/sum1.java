package programs.PracticeQuestion.PQ6;

import java.util.Scanner;

public class sum1 {
    public static void maxSumArray(int nums[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        int start=i;
        for(int j=i;j<nums.length;j++){
            int end=j;
            currSum=0;
            for(int k=start;k<=end;k++){
                currSum+=nums[k];
            }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
        }
        
    }
   System.out.println("Max Sum = "+maxSum);
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
