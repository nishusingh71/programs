package programs.PracticeQuestion.PQ6;

import java.util.Scanner;

public class BinarySearch {
    public static int binarysearch(int nums[],int key){
        int start=0, end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==key){
              return mid;
            }
            if(nums[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
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
        int index=binarysearch(nums,key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("key is at index: "+index);
        }
        s.close();
    }
}
