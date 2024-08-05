package mission.StudentInformation;

public class StudentManagementSystem {
    private Student[] studentArray;
    private int size;

    public StudentManagementSystem(int capacity) {
        this.studentArray = new Student[capacity];
        this.size = 0;
    }

    public void addStudent(Student student) {
        if(size < studentArray.length) {
            studentArray[size] = student;
            size++;
            System.out.println("학생 추가: " + student.getName());
        } else{
            System.out.println("학생 데이터베이스가 가득 찼습니다.");
        }
    }

    public void removeStudent(Student student) {
        for(int i = 0; i < size; i++) {
            if(studentArray[i] == student) {
                // 왼쪽으로 요소들을 이동
                for (int j = i; j < size - 1; j++) {
                    studentArray[j] = studentArray[j + 1];
                }
                studentArray[size - 1] = null;
                size--;
                System.out.println("학생 삭제: " + student.getName());
                return;
            }
        }
        System.out.println("학생을 찾을 수 없습니다.");
    }

    public void searchStudent(int studentId) {
        for(int i = 0; i < size; i++) {
            if(studentArray[i].getStudentId() == studentId) {
                System.out.println("학생을 찾았습니다.");
                System.out.println("이름: " + studentArray[i].getName());
                System.out.println("학번:" + studentArray[i].getStudentId());
                System.out.println("전공: " + studentArray[i].getMajor());
                System.out.println("학년:" + studentArray[i].getGrade());
                return;
            }
        }
        System.out.println("학생을 찾을 수 없습니다.");
    }
}
