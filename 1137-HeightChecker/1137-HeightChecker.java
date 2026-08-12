// Last updated: 12/08/2026, 11:58:14
class Solution {
    public int heightChecker(int[] heights) {
        int a=heights.length;
        int temp[]=new int[a];
        for(int i=0;i<a;i++){
            temp[i]=heights[i];
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a-1;j++){
                if(temp[j]>temp[j+1]){
                    int d=temp[j];
                    temp[j]=temp[j+1];
                    temp[j+1]=d;
                }
            }

        }
        int count=0;
        for(int i=0;i<a;i++){
            if(heights[i]!=temp[i]){
                count++;
            }
        }
        return count;
    }
}