// Last updated: 12/08/2026, 12:00:16
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==count){
                count++;
            }

        }
        return count;
    }
}