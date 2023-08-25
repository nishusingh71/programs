package programs.PracticeQuestion.PQ6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int nums[]){
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer>triplets=new ArrayList<Integer>();
                        triplets.add(nums[i]);
                         triplets.add(nums[j]);
                          triplets.add(nums[k]);
                         Collections.sort(triplets);
                          result.add(triplets);
                    }
                }
            }
        }
        result=new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
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
       System.out.println(threeSum(nums));
       s.close();
    }
}
