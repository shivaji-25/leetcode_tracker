// Last updated: 12/08/2026, 11:57:43
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        int a1=arr1.length;
        int a2=arr2.length;
        for(int i=0;i<a1;i++){
             int count1=0;
            for(int j=0;j<a2;j++){
                int temp=arr1[i]-arr2[j];
                int max=Math.abs(temp);
                if(max>d){
                    count1++;
                }
                else{
                    count1--;
                }
            }
            if(count1==a2){
                count++;
            }
        }
        return count;
    }
}