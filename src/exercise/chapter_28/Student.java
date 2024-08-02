package exercise.chapter_28;

public class Student {
    // 속성
    private String schoolName;
    private int classYear;
    private int classroomNumbers;
    private int studentNumber;

    // 기본 정보
    private String name;
    private String gender;

    // 행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }

    Student(){}

    Student(String name, String gender){
        this("School",1,3,-1,name,gender);
    }

    // 생성자
    Student(String schoolName, int classYear, int classroomNumbers, int studentNumber, String name, String gender){
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classroomNumbers = classroomNumbers;
        this.studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;
    }

    // getter
    public String getName(){
        return this.name;
    }
}
