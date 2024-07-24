package mission;

public class ChuncheonTicket3 {
    /**
     * 시립 박물관은 티켓값 반값 할인을 진행할 예정인데,
     * 나이가 65세 이상이고, 국적이 ＂한국”이면 반값으로 줄 예정이다.
     * 서로 다른 3명의 손님이 왔다. 3명은 반값 할인 적용 대상인가? 아닌가?
     * Alice(나이: 70, 나라: 미국)
     * Kim (나이: 65, 나라: 한국)
     * Yoo (나이: 42, 나라: 한국)
     * 각각 손님의 반값 적용 여부가 true 또는 false로 출력되어야 한다.
     */
    public static void main(String[] args) {
        int saleAge = 65;
        String saleNationality = "Korea";
        int AliceAge = 70;
        String AliceNationality = "USA";
        int KimAge = 65;
        String KimNationality = "Korea";
        int YooAge = 42;
        String YooNationality = "Korea";
        boolean resultAlice = saleAge <= AliceAge && saleNationality.equals(AliceNationality);
        System.out.println("Alice: " + resultAlice);
        boolean resultKim = saleAge <= KimAge && saleNationality.equals(KimNationality);
        System.out.println("Alice: " + resultKim);
        boolean resultYoo = saleAge <= YooAge && saleNationality.equals(YooNationality);
        System.out.println("Alice: " + resultYoo);

    }
}
