package exercise.chapter_45;

public class WrapperClassTest {

    public static void main(String[] args) {
        // Integer
        Integer integer1 = new Integer(20); // int -> Integer boxing
        Integer integer2 = new Integer(30);

        int int1 = integer1.intValue(); // unboxing, Integer -> int

        Integer integer3 = 20; // AutoBoxing, new Integer(20);
        int int2 = integer3;

        System.out.println(integer1); // 20
        System.out.println(int1); // 20
        System.out.println(integer3); // 20
        System.out.println(int2); // 20

        // 연산자
        System.out.println(integer1 + integer2); // 50
        System.out.println(integer1 + int1); // 40

        // Character
        Character character = new Character('X'); // 'X' charType -> Character boxing
        char ch1 = character.charValue();

        Character character1 = 'x';
        char ch2 = character1;

        System.out.println(character); // X
        System.out.println(ch1); // X

        Character[] characters = {'a', 'b', 'c'};
        char[] chars = {'a', 'b', 'c'};

        String str = String.valueOf(characters);
        String str2 = String.valueOf(chars);

        System.out.println(str); // [Ljava.lang.Character;@2a84aee7
        System.out.println(str2); // abc

        // Boolean Type
        Boolean boolean1 = new Boolean(true); // true boolean -> Boolean
        boolean b1 = boolean1.booleanValue(); // Unboxing

        Boolean boolean2 = false;
        boolean b2 = boolean2;

        System.out.println(boolean1 & boolean2); // false
        System.out.println(boolean1 | boolean2); // true
    }
}
