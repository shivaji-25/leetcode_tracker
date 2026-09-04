// Last updated: 04/09/2026, 19:11:03
1class Solution {
2    public String reverseWords(String s) {
3         String []arr=s.trim().split("\\s+");
4         String res="";
5         int i=arr.length -1;
6         while(i>=0){
7            res+=arr[i];
8            if(i!=0){
9                res+=" ";
10            }
11            i--;
12         }
13         return res;
14        }
15    }
16