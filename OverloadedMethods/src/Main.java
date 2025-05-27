//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("20 inches is " + convertToCentimetres(20) + " centimetres");
        System.out.println("6 foot 0 inches is " + convertToCentimetres(6,0) + " centimetres");

    }

    public static double convertToCentimetres(int inches) {
        return (inches * 2.54);
    }

    public static double convertToCentimetres(int feet, int inches) {
        int totalInches = (feet * 12) + inches;
        return convertToCentimetres(totalInches);
    }
}