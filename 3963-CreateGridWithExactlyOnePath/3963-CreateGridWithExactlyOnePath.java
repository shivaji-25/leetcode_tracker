// Last updated: 04/09/2026, 19:11:21
class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];

        // Fill all cells with '#'
        for (int i = 0; i < m; i++) {
            Arrays.fill(grid[i], '#');
        }

        // Make top row free
        for (int j = 0; j < n; j++) {
            grid[0][j] = '.';
        }

        // Make last column free
        for (int i = 0; i < m; i++) {
            grid[i][n - 1] = '.';
        }

        String[] ans = new String[m];
        for (int i = 0; i < m; i++) {
            ans[i] = new String(grid[i]);
        }

        return ans;
    }
}