public class LeapYear {
    public static boolean isLeapYear(int year) {
        int div4Quotient = year / 4;
        int div4Modulus = (year - (div4Quotient * 4));
        int div100Quotient = year / 100;
        int div100Modulus = (year - (div100Quotient * 100));
        int div400Quotient = year / 400;
        int div400Modulus = (year - (div400Quotient * 400));

        if (year <1 || year > 9999) {
            return false; // out of range
            // step 1 - check evenly divisible by 4
        } else if (div4Modulus == 0) {
            // step 2 - check evenly if it's a century
            if (div100Modulus == 0) {
                // step 3 - check if century is divisible by 400
                if (div400Modulus == 0) {
                    // step 4 - the year is a leap year
                    return true;
                } else { //year is a century but not divisible by 400
                    return false;
                }
            } else { // year is divisible by 4 and isn't a century
                return true;
            }
        } else {
            // step 5 - the year is not a leap year
            return false;
        }
    }
}