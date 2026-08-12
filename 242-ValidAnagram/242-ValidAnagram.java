// Last updated: 12/08/2026, 12:00:27
class Solution {
    public boolean isAnagram(String s, String t) {
      char n1[]=s.toCharArray();
      char n2[]=t.toCharArray();
      Arrays.sort(n1);
      Arrays.sort(n2);
      String a1=new String(n1);
      String a2=new String(n2);
      if(a1.equals(a2)){
        return true;
      }
       return false;
    }
}