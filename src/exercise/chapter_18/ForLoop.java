package exercise.chapter_18;

public class ForLoop {
    public static void main(String[] args) {
        // 1~10까지 다 더하기 for~loop
        int sum = 0;

        for (int num = 1; num <= 10; num++) {
            sum += num;
        }
        System.out.printf("1~10까지 더한 수는 %d 입니다.", sum);
    }
}
