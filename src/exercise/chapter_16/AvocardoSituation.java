package exercise.chapter_16;

public class AvocardoSituation {
    public static void main(String[] args) {
        // 장보기 전

        int milks = 0;
        int avocardos = 0;
        boolean existedAvaocado = true;

        // 장보기
        milks = 1;
        if(existedAvaocado) {
            avocardos = avocardos + 6;
        }
//        milks = {existedAvaocado} ? 6:0;

        // 집으로 돌아오기
        String comment = String.format("아내야, 장보고 돌아왔어 %d개 아보카도, %d개 우유 사왔어", avocardos, milks);
        System.out.println(comment);
    }
}
