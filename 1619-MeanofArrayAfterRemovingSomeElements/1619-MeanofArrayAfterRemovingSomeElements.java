// Last updated: 31/08/2026, 09:35:00
1class Solution {
2    public double trimMean(int[] arr) {
3        Arrays.sort(arr);
4        int remove=arr.length/20;
5        int sum=0;
6        for(int i=remove;i<arr.length-remove;i++){
7            sum+=arr[i];
8        }
9        return (double) sum/(arr.length -2 * remove);
10    }
11}