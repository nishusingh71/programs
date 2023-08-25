package programs.PracticeQuestion.PQ6;

import java.util.HashSet;
import java.util.Scanner;
//Approach(Brute Force) O(n^2)
public class DuplicateElmement {
    public static boolean containsDuplicate(int [] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    //Approach(2) using HashSet sets O(n)
    public static boolean containsDuplicate2(int []nums){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
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
        System.out.println(containsDuplicate2(nums));
        s.close();
    }
}
