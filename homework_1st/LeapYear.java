public class LeapYear {
    public static void main(String[] args) {
        int year = 2023;
        boolean res;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            res = true;
        } else {
            res = false;
        }
        System.out.println(year + " is a leap year? " + res);
    }
}
