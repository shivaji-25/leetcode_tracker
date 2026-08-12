// Last updated: 12/08/2026, 11:58:08
import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int[] result = new int[arr1.length];
        int index = 0;
        for (int num : arr2) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == num) {
                    result[index++] = arr1[i];
                    arr1[i] = -1;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                result[index++] = arr1[i];
            }
        }
        return result;
    }
}