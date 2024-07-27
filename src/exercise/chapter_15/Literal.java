package exercise.chapter_15;

public class Literal {
    public static void main(String[] args) {
        // 2진법
        int num = 0b1010;
        System.out.println(num); // 10

        // 16진법
        int num2 = 0xAC0; // 12 * 16 + 10 * 16^2 = 2752
        System.out.println(num2); // 2752

        double myDouble = 5.22E5;
        System.out.println(myDouble); // 522000.0

        double myDouble2 = 2.55E-3;
        System.out.println(myDouble2); // 0.00255

        // null
        String str = null;
        System.out.println(str); // null
    }
}
