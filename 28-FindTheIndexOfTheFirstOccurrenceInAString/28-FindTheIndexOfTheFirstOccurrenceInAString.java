// Last updated: 26/08/2026, 19:39:15
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}