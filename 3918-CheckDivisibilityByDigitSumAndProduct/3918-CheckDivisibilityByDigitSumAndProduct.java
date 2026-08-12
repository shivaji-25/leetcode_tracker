// Last updated: 12/08/2026, 11:56:47
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