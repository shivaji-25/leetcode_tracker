// Last updated: 26/08/2026, 19:38:57
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place numbers in correct position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // swap nums[i] with nums[nums[i]-1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Step 2: Find first index where nums[i] != i+1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: If all are in place, return n+1
        return n + 1;
    }
}
