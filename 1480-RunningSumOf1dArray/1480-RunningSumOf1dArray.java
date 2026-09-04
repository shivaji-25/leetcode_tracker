// Last updated: 04/09/2026, 19:12:29
class Solution {
    public int[] runningSum(int[] nums) {
        int sum[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                sum[i]+=nums[j];
            }
            
        }
         return sum;
    }
}