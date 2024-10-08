package exercise.chapter_54;

public class LambdaUseTest {

    public static void main(String[] args) {
        MultipleNum multipleNum = (num) -> num * 10;
        MultipleNum multipleNum2 = (num) -> num * 20;

        printNum(multipleNum2);

        printNum( (x) -> x * 100);

        GenericLambda<String> genericLambda1 = (str) -> str.toUpperCase();
        GenericLambda<Integer> genericLambda2 = (num) -> num * 2;
        GenericLambda<Boolean> genericLambda3 = (myBool) ->myBool & true;

        System.out.println(genericLambda1.calcultate("abc"));
        System.out.println(genericLambda2.calcultate(100));
        System.out.println(genericLambda3.calcultate(true));

    }

    static void printNum(MultipleNum multipleNum) {
        int result = multipleNum.calcultate(5);
        System.out.println(result);
    }
}
