// Last updated: 12/08/2026, 12:17:37
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-1;i++){
           count=Math.max(count,nums[i+1]-nums[i]);
        }
        if(nums.length<2){
            return 0;
        }
        return count;
    }
}