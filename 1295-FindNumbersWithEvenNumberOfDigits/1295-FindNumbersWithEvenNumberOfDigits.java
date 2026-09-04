// Last updated: 04/09/2026, 19:12:49
class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int i=0;i<nums.length;i++){
            int temp=String.valueOf(nums[i]).length();
            if(temp%2==0){
                even++;
            }

        }
        return even;
    }
}