package exercise.chapter_25;

public class Fish {
    // 속성
    String sex; // 'Male', 'Female'
    boolean havingPoison; // true:독이 있다 , False: 독이 없다
    String StartSpawningDate; // 산란 시작 시각
    String endSpawningDate; // 산란 종료 시각
    String leavingSea; // 사는 속성

    // 행위
    void eat(String food){
        System.out.printf("나, 물고기는 %s를 먹고 있습니다.\n", food);
    }
    void swim(int meter){
        System.out.println("나는 헤엄칩니다. 미터: "+ meter);
    }
    void makeCrowd(Fish otherFish){
        System.out.println("나는 다른 물고기와 무리짓습니다.");
    }
    void sleep(){}
}
