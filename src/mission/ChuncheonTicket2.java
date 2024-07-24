package mission;

public class ChuncheonTicket2 {
    /**
     * 시립 박물관 오픈기념으로 시청 근무자들에게 박물관 티켓 625장 을 무료로 배포하려고 한다.
     * 최대 몇 명까지 나눠줄 수 있고, 그 때 몇 장의 티켓이 남는가?
     * 이 때, 각각 개인은 ”3＂장의 티켓을 가져간다.
     */
    public static void main(String[] args) {
        int museumTicket = 625;
        int finalPeople = museumTicket / 3;
        int remainTicket = museumTicket % 3;
        System.out.println(finalPeople);
        System.out.println(remainTicket);
    }
}
