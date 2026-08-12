// Last updated: 12/08/2026, 12:18:39
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp1[]=new int[m];
        for(int i=0;i<m;i++){
            temp1[i]=nums1[i];
        }
        int temp2[]=new int[n];
        for(int j=0;j<n;j++){
            temp2[j]=nums2[j];
        }
        int temp3[]=new int[m+n];
        for(int i=0;i<m;i++){
            temp3[i]=temp1[i];
        }
        for(int j=0;j<n;j++){
            temp3[j+m]=temp2[j];
        }
        Arrays.sort(temp3);
        for(int i=0;i<m+n;i++){
            nums1[i]=temp3[i];
        }
    }
}