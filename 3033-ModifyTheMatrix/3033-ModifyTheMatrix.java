// Last updated: 04/09/2026, 19:11:40
class Solution {

    public int[][] modifiedMatrix(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[] maxCol = new int[n];

        // Find maximum of each column
        for (int j = 0; j < n; j++) {
            maxCol[j] = Integer.MIN_VALUE;

            for (int i = 0; i < m; i++) {
                maxCol[j] = Math.max(maxCol[j], matrix[i][j]);
            }
        }

        // Replace -1 with column maximum
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = maxCol[j];
                }
            }
        }

        return matrix;
    }
}