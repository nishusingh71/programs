package programs.PracticeQuestion.PQ6;

import java.util.Scanner;

public class subArrays {
    public static void printSubarrays(int nums[]){
        int ts=0;
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("total subarray = "+ts);
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
        printSubarrays(nums);
        s.close();
    }
}
