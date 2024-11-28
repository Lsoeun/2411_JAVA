public class StudentTest3 {

    // 학생 이름을 출력하는 메서드
    public void printStudentNames(Student2[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].studentName);
        }
    }

    public static void main(String[] args) {
        // 학생 객체 생성
        Student2 studentAhn = new Student2();
        studentAhn.studentName = "안승연";

        Student2 studentLee = new Student2();
        studentLee.studentName = "이소은";

        Student2 studentKim = new Student2();
        studentKim.studentName = "김이름";

        // 학생객체들을 배열에 저장 (배열 객체 생성)
        Student2[] students = {studentAhn, studentLee, studentKim};

        StudentTest3 studentTest3 = new StudentTest3();
        // 이름을 출력하는 메서드 호출
        studentTest3.printStudentNames(students);
    }
}
