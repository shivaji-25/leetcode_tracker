// Last updated: 12/08/2026, 11:57:44
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int a=nums.length;
        int ans[]=new int[a];
        for(int i=0;i<a;i++){
            int count=0;
            for(int j=0;j<a;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i]=count;  
        }
        return ans;
    }
}