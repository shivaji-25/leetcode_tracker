// Last updated: 04/09/2026, 19:13:33
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
         nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}