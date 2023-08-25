package programs.PracticeQuestion.Recursion;

import java.util.Scanner;

public class index {
    public static void allOccurence(int arr[],int key,int index){
        //Base Case
        if(index==arr.length){
            return;
        }
        if(arr[index]==key){
            System.out.print(index);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int index=0;
        allOccurence(arr,key,index+1);
        sc.close();
    }
}
