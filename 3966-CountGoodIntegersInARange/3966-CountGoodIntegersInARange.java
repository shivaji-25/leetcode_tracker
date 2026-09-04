// Last updated: 04/09/2026, 19:11:31
import java.util.*;

class Solution {
    private long[][][][] dp;
    private int[] digits;
    private int k;

    public long goodIntegers(long l, long r, int k) {
        this.k = k;
        return count(r) - count(l - 1);
    }

    private long count(long num) {
        if (num < 0) return 0;

        String s = String.valueOf(num);
        digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }

        dp = new long[s.length()][11][2][2];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 11; j++) {
                for (int t = 0; t < 2; t++) {
                    Arrays.fill(dp[i][j][t], -1);
                }
            }
        }

        return dfs(0, 10, 1, 0);
    }

    private long dfs(int pos, int prev, int tight, int started) {
        if (pos == digits.length) {
            return 1;
        }

        if (dp[pos][prev][tight][started] != -1) {
            return dp[pos][prev][tight][started];
        }

        int limit = (tight == 1) ? digits[pos] : 9;
        long ans = 0;

        for (int d = 0; d <= limit; d++) {
            int ntight = (tight == 1 && d == limit) ? 1 : 0;

            if (started == 0 && d == 0) {
                ans += dfs(pos + 1, 10, ntight, 0);
            } else {
                if (started == 0 || Math.abs(prev - d) <= k) {
                    ans += dfs(pos + 1, d, ntight, 1);
                }
            }
        }

        return dp[pos][prev][tight][started] = ans;
    }
}