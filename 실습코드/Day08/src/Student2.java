public class Student2 {
    private static int serialNum = 1000; // private 변수로 변경
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public Student2() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    // serialNum의 get()메서드
    public static int getSerialNum() {
        int i = 10; // getSerialNum() 메서드 내부에서만 사용할 수 있는 지역변수
        // studentName = "이지원"; // 오류발생 -> 인스턴스 변수이기 때문!
        return serialNum; // serialNum은 static 변수이므로 static 메서드 내부에서 사용 가능
    }

    // serialNum의 set()메서드
    public static void setSerialNum(int serialNum) {
        Student2.serialNum = serialNum;
    }
}
