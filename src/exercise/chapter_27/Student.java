package exercise.chapter_27;

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

    Student(){
    }
    Student(String pName, String pGender){
        name = pName;
        gender = pGender;
    }

    // 생성자
    Student(String pSchoolName, int pClassYear, int pClassroomNumbers, int pStudentNumber, String pName, String pGender){
        schoolName = pSchoolName;
        classYear = pClassYear;
        classroomNumbers = pClassroomNumbers;
        studentNumber = pStudentNumber;
        name = pName;
        gender = pGender;
    }

    // getter
    public String getName(){
        return name;
    }
}
