// Last updated: 26/08/2026, 19:39:18
class Solution {
    public int removeElement(int[] nums, int val) {
      int k=0;
      int i=0;
      while(i<nums.length){
        if(nums[i]!=val){
            nums[k]=nums[i];
            k++;
        }
        i++;
      }
      return k;
    }
}