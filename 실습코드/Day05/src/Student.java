public class Student {
    int studentID; // 학번
    String studentName; // 학생이름
    int grade; // 학년
    String address; // 사는 곳

    // 메서드 추가
    public void showStudentInfo() { // 학생 이름과 주소를 출력하는 기능을 가진 메서드
        System.out.println(studentName + "," + address); // 이름, 주소 출력
    }
}