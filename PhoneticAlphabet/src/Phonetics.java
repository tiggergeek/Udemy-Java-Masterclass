public class Phonetics {
    public static void main(String[] args) {

        conversion('E');
    }

    public static void conversion(char initial) {
        switch (initial) {
            case 'A':
                System.out.println(initial + " = " + "Able");
                break;
            case 'B':
                System.out.println(initial + " = " + "Baker");
                break;
            case 'C':
                System.out.println(initial + " = " + "Charlie");
                break;
            case 'D':
                System.out.println(initial + " = " + "Dog");
                break;
            case 'E':
                System.out.println(initial + " = " + "Easy");
                break;
            default:
                System.out.println("Letter " + initial + " not found");
                break;
        }
    }
}
