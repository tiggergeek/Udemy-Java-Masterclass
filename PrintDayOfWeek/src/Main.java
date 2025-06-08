public class Main {

    public static void main(String[] args) {
        printday(0);
        printday(1);
        printday(2);
        printday(3);
        printday(4);
        printday(5);
        printday(6);
        printday(30);

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(2,2001));
    }

    public static void printday(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> day + " is an Invalid Input Value";
        };
        System.out.println(dayOfTheWeek);
    }

    public static boolean isLeapYear(int year) {
        if (year <1 || year > 9999) return false;
        else if ((year % 100) == 0) {
            return (year % 400) == 0;
        } else return (year % 4) == 0;
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) return -1;
        else {
            return switch(month) {
                case 9,4,6,11 -> 30;
                case 1,3,5,7,8,10,12 -> 31;
                default -> {
                    if (isLeapYear(year)) yield 29;
                    else yield 28;
                }
            };
        }
    }
}
