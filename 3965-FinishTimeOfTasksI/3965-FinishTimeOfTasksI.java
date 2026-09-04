// Last updated: 04/09/2026, 19:11:35
class Solution {
    List<Integer>[] tree;

    public long finishTime(int n, int[][] edges, int[] baseTime) {
        tree = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            tree[edge[0]].add(edge[1]);
        }

        return dfs(0, baseTime);
    }

    private long dfs(int node, int[] baseTime) {
        if (tree[node].isEmpty()) {
            return baseTime[node];
        }

        long minFinish = Long.MAX_VALUE;
        long maxFinish = Long.MIN_VALUE;

        for (int child : tree[node]) {
            long childFinish = dfs(child, baseTime);

            minFinish = Math.min(minFinish, childFinish);
            maxFinish = Math.max(maxFinish, childFinish);
        }

        long ownDuration = (maxFinish - minFinish) + baseTime[node];

        return maxFinish + ownDuration;
    }
}