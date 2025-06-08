public class ForLoops {

    public static void main(String[] args) {
        printIncrements(5);
        double principle = 100;

        for (double i = 7.5; i <= 10; i += .25) {
            double interestAmount = calculateInterest(principle, i);
            if (interestAmount > 8.5) break;
            System.out.println(i + "% of " + principle + " = " + interestAmount);
        }
    }

    public static void printIncrements(int cycles) {

        for (int i = cycles; i > 0; i--) System.out.println(i);
    }

    public static double calculateInterest(double principle, double rate) {
        return (principle * (rate / 100));
    }
}
