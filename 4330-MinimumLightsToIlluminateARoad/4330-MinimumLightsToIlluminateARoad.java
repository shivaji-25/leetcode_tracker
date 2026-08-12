// Last updated: 12/08/2026, 11:56:40
class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;
        int[] diff = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (lights[i] > 0) {
                int left = Math.max(0, i - lights[i]);
                int right = Math.min(n - 1, i + lights[i]);

                diff[left]++;
                diff[right + 1]--;
            }
        }

        boolean[] visible = new boolean[n];
        int cur = 0;

        for (int i = 0; i < n; i++) {
            cur += diff[i];
            visible[i] = cur > 0;
        }

        int ans = 0;
        int i = 0;

        while (i < n) {
            if (visible[i]) {
                i++;
            } else {
                ans++;
                i += 3; 
            }
        }

        return ans;
    }
}