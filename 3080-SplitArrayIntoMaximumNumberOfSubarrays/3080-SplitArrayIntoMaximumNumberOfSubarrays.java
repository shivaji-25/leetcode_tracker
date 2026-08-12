// Last updated: 12/08/2026, 11:57:03
class Solution {
    public int maxSubarrays(int[] nums) {

        int count = 0;
        int andValue = -1; // All bits set to 1

        for (int num : nums) {

            andValue &= num;

            if (andValue == 0) {
                count++;
                andValue = -1;
            }
        }

        return count == 0 ? 1 : count;
    }
}