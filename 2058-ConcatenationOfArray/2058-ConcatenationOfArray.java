// Last updated: 12/08/2026, 11:57:15
class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[2 * nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        return arr;
    }
}