package mission.StudentScore;

import java.util.Arrays;

public class StudentScore {

    public static void main(String[] args) {
        System.out.println("학생들이 아무도 없을 때, 전체 시험 점수: " + Arrays.toString(StudentScore.getAllScores()));

        StudentScore student1 = new StudentScore(85);

        System.out.println("학생이 한명 추가 되었을 때, 전체 시험 점수: " + Arrays.toString(StudentScore.getAllScores()));

        StudentScore student2 = new StudentScore(90);
        StudentScore student3 = new StudentScore(77);

        System.out.println("여러 명 추가후 전체 시험 점수: " + Arrays.toString(StudentScore.getAllScores()));

        student1.setScore(95);
        student2.setScore(88);
        student3.setScore(55);

        System.out.println("변경된 전체 시험 점수: " + Arrays.toString(StudentScore.getAllScores()));

        StudentScore student4 = new StudentScore(20);

        System.out.println("추가후 전체 시험 점수: " + Arrays.toString(StudentScore.getAllScores()));

        System.out.println("Student1 점수: " + student1.getScore());
        System.out.println("Student2 점수: " + student2.getScore());
        System.out.println("Student3 점수: " + student3.getScore());
        System.out.println("Student4 점수: " + student4.getScore());
    }

    // static
    private static int serialIndex;
    private static int[] allScores;

    static {
        serialIndex = 0;
        allScores = null;
    }

    // static method
    public static int[] getAllScores() {
        return allScores;
    }
    // getAllScores 메서드는 allScores 배열 반환

    private static void initializeAllScores(int score) {
        allScores = new int[]{score};
    }

    private static void addAllScores(int score) {
        if (allScores ==  null) {
            initializeAllScores(score);
            return;
        }

        int length = allScores.length;
        allScores = Arrays.copyOf(allScores, length + 1);
        allScores[length] = score;
    }

    private int myIndex; // 해당 인스턴스의 인덱스 저장
    private int score; // 해당 인스턴스의 점수 저장

    public int getScore(){
        return score;
    }
    // 점수 가져오기

    public void setScore(int score){
        this.score = score;
        allScores[myIndex] = score;
    }
    // 점수 설정

    public StudentScore(int score) {
        this.myIndex = serialIndex++;
        this.score = score;
        addAllScores(score);
    }
    // 새로운 학생 인스턴스를 생성하고, 점수를 배열에 추가
}
