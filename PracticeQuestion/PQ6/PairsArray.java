package programs.PracticeQuestion.PQ6;

import java.util.Scanner;

public class PairsArray {
    public static void printPairs(int nums[]){
        int temp=0;
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+current+","+nums[j]+")");
                temp++;
            }
           System.out.println();
           
        }
        System.out.print("temp: "+temp);
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
        printPairs(nums);
        s.close();
    }
}
