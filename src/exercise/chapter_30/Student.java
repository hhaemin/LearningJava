package exercise.chapter_30;

import exercise.chapter_28.Teacher;

public class Student {

    private static int serialNum = 1;
    static String city = "Seoul";
    // 속성
    private String schoolName;
    private int classYear;
    private int classroomNumbers;
    private int studentNumber;
    private int studentID;

    // 기본 정보
    private String name;
    private String gender;

    // 정적 메소드
    public static int getSerialNumber() {
        return serialNum;
    }
    public static void setSerialNumber(int num) {
        serialNum = num;
    }

    // 행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }

    public void printMyInfo(){
        System.out.printf("[Student] schoolName: %s, classYear: %s, classroomNumber: %d, " +
                "studentNumber: %d, studentID: %d, name: %s, gender: %s \n",
                this.schoolName, this.classYear, this.classroomNumbers,
                this.studentNumber, this.studentID, this.name, this.gender);
    }

    Student(){}

    Student(String name, String gender){
        this("School",1,3,-1,name,gender);
    }

    // 생성자
    Student(String schoolName, int classYear, int classroomNumbers, int studentNumber, String name, String gender){
        this.studentID = serialNum++;
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
