package exercise.chapter_13;

public class ExplicitCasting {
    public static void main(String[] args) {
        // 더 정밀한 타입 -> 덜 정밀한 타입
        float myFloat = 5.55f;
        int myInt = (int)myFloat;
        System.out.println(myInt); // 5

        // 큰 size -> 작은 size
        int myInt2 = 600;
        byte myByte = (byte)myInt2;
        System.out.println(myByte); // 88

        // 연산 "+"
        double myDouble = 5.5;
        double myDouble2 = 3.7;

        int result = (int)myDouble + (int)myDouble2;
        System.out.println(result); // 8
        int result2 = (int) (myDouble + myDouble2);
        System.out.println(result2); // 9
    }
}
