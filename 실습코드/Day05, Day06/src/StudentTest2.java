public class StudentTest2 {
    public static void main(String[] args) {
        Student2 student1 = new Student2();  // 첫 번째 학생 생성(첫 번째 인스턴스)
        student1.studentName = "안연수";
        System.out.println(student1.getStudentName());

        Student2 student2 = new Student2();  // 두 번째 학생 생성 (두 번째 인스턴스)
        student2.studentName = "안승연";
        System.out.println(student2.getStudentName());
    }
}
