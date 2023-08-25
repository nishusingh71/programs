package programs.PracticeQuestion.Recursion;

import java.util.Scanner;

public class firstOccurenceEx {
    public static int lastOccurrence(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurrence(arr,key,i+1);
        if(isFound!=-1){
            return isFound;
        }
        if(isFound==-1&&arr[i]==key){
            return i;
        }
      return isFound;
    }
    public static int firstOccurrence(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurrence(arr, key, i+1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int [n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int key=sc.nextInt();
    //   int i=sc.nextInt();
      System.out.println(lastOccurrence(arr,key,0));
      sc.close();  
    }
    
}
