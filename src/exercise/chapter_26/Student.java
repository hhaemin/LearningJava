package exercise.chapter_26;

public class Student {
    // 속성
    String schoolName;
    int classYear;
    int classroomNumbers;
    int studentNumber;

    // 기본 정보
    String name;
    String gender;

    // 행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.name;
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
}
