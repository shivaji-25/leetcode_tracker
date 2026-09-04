// Last updated: 04/09/2026, 19:12:16
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