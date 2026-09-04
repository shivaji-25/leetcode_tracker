// Last updated: 04/09/2026, 19:13:43
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int []res=new int[nums.length];
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[ind++]=nums[i];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2!=0){
               res[ind++]=nums[j];
            }
        }
        return res;
    }
}