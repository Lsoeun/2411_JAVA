public class Student {
    int studentID; // 학번
    String studentName; // 학생이름
    int grade; // 학년
    String address; // 사는 곳

    // 학생의 이름을 부여하는 메서드
    public void setStudentName(String name) { // 학생 이름을 매개 변수로 전달
        studentName = name;
    }

    // 학생의 이름을 반환하는 메서드
    public String getStudentName() {
        return studentName;
    }

    // 학생 이름과 주소를 출력하는 기능을 가진 메서드
    public void showStudentInfo() {
        System.out.println(studentName + "," + address); // 이름, 주소 출력
    }
}