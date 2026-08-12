// Last updated: 12/08/2026, 12:19:12
class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int first=1;
        int sec=2;
        int count=0;
        for(int i=3;i<=n;i++){
            count=first+sec;
            first=sec;
            sec=count;
        }
        return count;
    }
}