// Last updated: 26/08/2026, 19:40:00
class Solution {
    public boolean isPalindrome(int x) {
        String a=String.valueOf(x);
        String ans="";
        for(int i=a.length()-1;i>=0;i--){
            ans+=a.charAt(i);
        }
        if(ans.equals(a)){
            return true;
        }
        return false;
        
    }
}