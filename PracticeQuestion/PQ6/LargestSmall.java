package programs.PracticeQuestion.PQ6;

import java.util.Scanner;

public class LargestSmall {
    public static int getLargest(int nums[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(largest<nums[i]){
                largest=nums[i];
            }
            if(smallest>nums[i]){
                smallest=nums[i];
            }
           
        }
         System.out.println("Smallest value is:"+smallest);
            return largest;
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
        System.out.println("Largest value is: "+getLargest(nums));
        s.close();
    }
}
