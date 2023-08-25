package programs.PracticeQuestion.PQ6;

import java.util.Scanner;

public class Trapped {
    public static int trap(int [] height){
        int n=height.length;
        int res=0,l=0,r=n-1;
        int rMax=height[r],lMax=height[l];
        while(l<r){
            if(lMax<rMax){
                l++;
                lMax=Math.max(lMax,height[l]);
                res=lMax-height[l];
            }else{
                r--;
                rMax=Math.max(rMax, height[r]);
                res=rMax-height[r];
            }
        }
        return res;
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
       System.out.println(trap(nums));
       s.close();
    }
}
