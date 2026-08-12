// Last updated: 12/08/2026, 11:57:57
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        int arr1[] = new int[20000];
        for (int i = 0; i < arr.length; i++) {
            arr1[arr[i] + 2000]++;
        }
        for (int i = 0; i < 20000; i++) {
            if (arr1[i] > 0) {
                for (int j = i + 1; j < 20000; j++) {
                    if (arr1[i] == arr1[j]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}