// Last updated: 12/08/2026, 12:17:36
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int temp=0;
        int ans=nums.length/2;
        
        for(int i=0;i<nums.length;i++){
            int count=0;
           for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
            }
           }
            if(count>ans){
                temp=nums[i];
                return temp;
            }
          
        }
        return -1;
    }
}