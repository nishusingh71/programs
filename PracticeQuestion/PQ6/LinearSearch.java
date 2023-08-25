package programs.PracticeQuestion.PQ6;

import java.util.Scanner;

public class LinearSearch {
    public static int linearsearch(int nums[],int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter your Search Keys: ");
        int key =s.nextInt();
        int index=linearsearch(nums,key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("key is at index: "+index);
        }
        s.close();
        
    }
}
