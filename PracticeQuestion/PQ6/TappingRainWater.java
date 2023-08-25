package programs.PracticeQuestion.PQ6;

import java.util.Scanner;

public class TappingRainWater {
    public static int trappedRainWater(int height[]){
        //Calculate left max boundary-array
         int leftMax[]=new int[height.length];
         leftMax[0]=height[0];
         for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
         }
        //Calculate right max boundary-array
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        //loop
        int trappedWater=0;
        for(int i=0;i<height.length;i++){
           
             //WaterLevel=min(leftmax bound,rightmax bound)
             int waterLevel=Math.min(leftMax[i],rightMax[i]);
              //trapped water=WaterLevel-heigh[i]
             trappedWater+=waterLevel-height[i];
        }
       
        return trappedWater;
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
        System.out.println(trappedRainWater(nums));
        s.close();
    }
}
