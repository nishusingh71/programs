package programs.PracticeQuestion.DivideConquer;

public class MajElement {
   //Brute Force Apporach-O(n*n)
   public static int majorityElement(int[] nums){
    int majorityCount=nums.length/2;
    for(int i=0;i<nums.length;i++){
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==nums[i]){
                count+=1;
            }
        }
        if(count>majorityCount){
            return nums[i];
        }
    }
    return -1;
   } 
   //Approach2 Optimize-O(nlogn)
   private static int countInRange(int[] nums,int num,int lo,int hi){
    int count=0;
    for(int i=lo;i<=hi;i++){
        if(nums[i]==num){
            count++;
        }
    }
    return count;
   }
   private static int majorityElementRec(int[] nums, int lo, int hi){
    if(lo==hi){
        return nums[lo];
    }
    int mid=(hi-lo)/2+lo;
    int left=majorityElementRec(nums, lo, mid);
    int right=majorityElementRec(nums, mid+1, hi);
    if(left==right){
        return left;
    }
    int leftCount=countInRange(nums,left,lo,hi);
    int rightCount=countInRange(nums,right,lo,hi);
    return leftCount>rightCount?left:right;
   }
   public static int majorityElements(int[] nums){
    return majorityElementRec(nums,0,nums.length-1);
   }
   public static void main(String[] args) {
    int nums[]={2,2,1,1,1,2,2};
    System.out.println(majorityElements(nums));
   }
}
