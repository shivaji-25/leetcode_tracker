// Last updated: 12/08/2026, 11:58:02
class Solution {
    public int dayOfYear(String date) {
        // Split the date into year, month, day
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        // Days in each month (non-leap year by default)
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        // Adjust February for leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        // Sum days of previous months + current day
        int dayOfYear = day;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }

        return dayOfYear;
    }

    private boolean isLeapYear(int year) {
        // Leap year rule: divisible by 400 OR divisible by 4 but not by 100
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
