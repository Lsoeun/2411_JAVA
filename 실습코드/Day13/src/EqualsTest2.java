public class EqualsTest2 {
    public static void main(String[] args) {

        Student2 studentLee = new Student2(100, "이상원");
        Student2 studentLee2 = studentLee; // 주소 복사
        Student2 studentSang = new Student2(100, "이상원");

        // 동일한 주소의 두 인스턴스 비교
        if(studentLee == studentLee2) { // == 기호로 비교
            System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
        } else {
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
        }

        if(studentLee.equals(studentLee2)) { // equals() 메서드로 비교
            System.out.println("studentLee와 studentLee2는 동일합니다.");
        } else {
            System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
        }

        // 동일인이지만 인스턴스의 주소가 다른 경우
        if(studentLee == studentSang) { // == 기호로 비교
            System.out.println("studentLee와 studentSang의 주소는 같습니다.");
        } else {
            System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
        }

        if(studentLee.equals(studentSang)) { // equals() 메서드로 비교
            System.out.println("studentLee와 studentSang은 동일합니다.");
        } else {
            System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
        }
    }
}
