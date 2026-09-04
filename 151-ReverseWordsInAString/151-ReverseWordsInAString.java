// Last updated: 04/09/2026, 19:15:02
class Solution {
    public String reverseWords(String s) {
         String []arr=s.trim().split("\\s+");
         String res="";
         int i=arr.length -1;
         while(i>=0){
            res+=arr[i];
            if(i!=0){
                res+=" ";
            }
            i--;
         }
         return res;
        }
    }
