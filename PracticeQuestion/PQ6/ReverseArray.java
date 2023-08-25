package programs.PracticeQuestion.PQ6;

import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int nums[]){
        int first=0,last=nums.length-1;
        while(first<last){
            int temp=nums[last];
            nums[last]=nums[first];
            nums[first]=temp;
            first++;
            last--;
        }
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
        System.out.println("Reverse Array: ");
        reverse(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        s.close();
    }
}
