// Last updated: 12/08/2026, 11:57:36
class Solution {
    public int maxProduct(int[] nums) {
       Arrays.sort(nums);
        return (nums[nums.length-1] -1)*(nums[nums.length-2] -1);
    }
}