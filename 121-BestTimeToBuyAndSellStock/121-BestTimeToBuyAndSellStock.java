// Last updated: 12/08/2026, 12:18:01
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update minimum price seen so far
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if sold today
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
