// Last updated: 26/08/2026, 19:39:02
class Solution {
    public int searchInsert(int[] nums, int target) {
        int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            return i;
        }
        else if(nums[i]!=target && nums[i]<target)
        {
            count++;
        }
      }
      return count;
    }
}