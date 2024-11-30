public class Student {
    int studentID;
    private String studentName; // studentName 변수를 private으로 선언
    int grade;
    String address;

    public String getStudentName() { // studentName에 접근해서 값을 가져오는 메서드
        return studentName;
    }

    public void setStudentName(String studentName) {
        // studentName에 접근해서 값을 지정하는 메서드
        this.studentName = studentName;
    }
}