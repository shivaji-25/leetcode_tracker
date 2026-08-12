// Last updated: 12/08/2026, 11:59:50
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        // Count characters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        // Check ransom note
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (count[ch - 'a'] == 0) {
                return false;
            }

            count[ch - 'a']--;
        }

        return true;
    }
}