// Last updated: 12/08/2026, 11:58:47
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scoreRecord = new ArrayList<>();
        int totalSum = 0;
        for (String op : operations) {
            switch (op) {
                case "+":
                    int size = scoreRecord.size();
                    int newSum = scoreRecord.get(size - 1) + scoreRecord.get(size - 2);
                    totalSum += newSum;
                    scoreRecord.add(newSum);
                    break;
                case "D":
                    int doubleScore = scoreRecord.get(scoreRecord.size() - 1) * 2;
                    totalSum += doubleScore;
                    scoreRecord.add(doubleScore);
                    break;
                case "C":
                    totalSum -= scoreRecord.remove(scoreRecord.size() - 1);
                    break;
                default:
                    int val = Integer.parseInt(op);
                    totalSum += val;
                    scoreRecord.add(val);
                    break;
            }
        }
        return totalSum;
    }
}
