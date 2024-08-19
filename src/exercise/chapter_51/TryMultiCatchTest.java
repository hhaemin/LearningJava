package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {

    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("src/exercise/chapter_51/test.txt");

            int i = 10;
            int data = 100 / i;

            String str = "abc";
            System.out.println(str.toUpperCase());

            int index = 10;
            int [] intArr = new int[10];
            System.out.println(intArr[index]);

        } catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수가 없습니다.");
            e.printStackTrace();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Arithmetic Exception / NullPoint Exception 발생");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("최종 Exception 필터에 걸렸습니다.");
            e.printStackTrace();
        }
//        catch (NullPointerException e) {
//            System.out.println("NullPointException 발생");
//            e.printStackTrace();
//        }
        System.out.println("메인 메소드가 종료됩니다.");
    }
}
