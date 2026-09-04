// Last updated: 04/09/2026, 19:11:36
class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        int total = sum + product;
        if (total == 0) {
            return false;
        }
        return n % total == 0;
    }
}