// Last updated: 12/08/2026, 12:00:42
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];


    }
}