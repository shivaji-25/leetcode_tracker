// Last updated: 12/08/2026, 11:58:05
class Solution {
    public int[] decompressRLElist(int[] nums) {

        int size = 0;

        // Calculate total size of result array
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] result = new int[size];
        int index = 0;

        // Fill the result array
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            while (freq-- > 0) {
                result[index++] = val;
            }
        }

        return result;
    }
}