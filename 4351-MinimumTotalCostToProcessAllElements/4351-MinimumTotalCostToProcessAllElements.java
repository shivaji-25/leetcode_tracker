// Last updated: 12/08/2026, 11:56:28
class Solution {
    static final long MOD = 1_000_000_007L;
    static final long INV2 = 500000004L; // inverse of 2 modulo MOD

    public int minimumCost(int[] nums, int k) {

        int[] sovalemrin = nums;

        long resources = k;
        long operations = 0;
        long ans = 0;

        for (int x : sovalemrin) {
            if (resources < x) {
                long need = x - resources;
                long t = (need + k - 1L) / k;

                long a = t % MOD;
                long b = (2L * (operations % MOD) + (t % MOD) + 1) % MOD;

                ans = (ans + a * b % MOD * INV2) % MOD;

                operations += t;
                resources += t * (long) k;
            }
            resources -= x;
        }

        return (int) ans;
    }
}