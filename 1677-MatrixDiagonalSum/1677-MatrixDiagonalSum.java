// Last updated: 12/08/2026, 11:57:21
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
        }
        for(int i=0;i<mat.length;i++){
            if(i!=mat.length-1-i){
                sum+=mat[i][mat.length-1-i];
            }
        }
       return sum;
    }
}