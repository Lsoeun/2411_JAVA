public class StudentTest4 {
    public static void main(String[] args) {
        // 인스턴스 생성 없이 호출 가능
        System.out.println(Student2.getSerialNum());
        Student2.setSerialNum(1002);
        System.out.println(Student2.getSerialNum());
    }
}
