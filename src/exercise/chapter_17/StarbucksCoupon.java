package exercise.chapter_17;

public class StarbucksCoupon {
    public static void main(String[] args) {
        //
        boolean clearCondition1 = true;
        boolean clearCondition2 = true;
        boolean clearCondition3 = false;
        boolean clearCondition4 = true;

        if( clearCondition1 ){
            if(clearCondition2){
                if (clearCondition3){
                    if(clearCondition4) {
                        System.out.println("스타벅스 쿠폰 이벤트 신청할 수 있게 되었습니다.");
                    }
                    else {
                        System.out.println("아니요, 4번째 실패해서, 내돈내산으로 커피 먹겠습니다.");
                    }
                }
                else {
                    System.out.println("아니요, 3번째 실패해서, 내돈내산으로 커피 먹겠습니다.");
                }
            }
            else {
                System.out.println("아니요, 2번째 실패해서, 내돈내산으로 커피 먹겠습니다.");
            }
        }
        else {
            System.out.println("아니요, 1번째 실패해서, 내돈내산으로 커피 먹겠습니다.");
        }
    }
}
