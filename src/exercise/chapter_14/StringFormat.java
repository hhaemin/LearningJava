package exercise.chapter_14;

public class StringFormat {
    public static void main(String[] args) {
        // String
        String str1 = "Happy";
        String str2 = String.valueOf(123);

        System.out.println(str1); // Happy
        System.out.println(str2); // 123

        // String 1
        String result;

        result = String.format("문자 서식: %s, %S", str1, str1);
        System.out.println(result); // 문자 서식: Happy, HAPPY

        // Int
        int myInt = 10;
        result = String.format("정수 서식:%d",myInt);
        System.out.println(result); // 정수 서식:10

        // float
        float myFloat = 123.456f;
        result = String.format("실수 서식: %f, %.1f, %.2f, %.3f", myFloat, myFloat, myFloat, myFloat);
        System.out.println(result); // 실수 서식: 123.456001, 123.5, 123.46, 123.456
    }
}
