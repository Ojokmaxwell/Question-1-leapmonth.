public class LeapMonth {
    public static void main(String[] args) {
        int year = 2024; // Change this value to test different years
        boolean isLeapMonth = isLeapYear(year);

        if (isLeapMonth) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (year % 100 != 0) || (year % 400 == 0);
        return isLeapMonth;
    }
}