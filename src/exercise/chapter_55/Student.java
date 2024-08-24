package exercise.chapter_55;

public class Student {

    // 학교 정보
    private int schoolYear;
    private int classroomNumber;
    private int studentNumber;

    // 학생 개인 정보
    private String name;
    private String gender;
    private int score;

    // 행위

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    Student(){
        this("unknown", "unknown");
    }
    Student(String name, String gender){
        this(name, gender, 5, 10 , 0, 0);
    }

    Student(String name, String gender, int score){
        this(name, gender, 5, 10 , 0, score);
    }
    Student(String name, String gender, int schoolYear, int classroomNumber, int studentNumber, int score){
        this.name = name;
        this.gender = gender;
        this.schoolYear = schoolYear;
        this.classroomNumber = classroomNumber;
        this.studentNumber = studentNumber;
        this.score = score;
    }
}
