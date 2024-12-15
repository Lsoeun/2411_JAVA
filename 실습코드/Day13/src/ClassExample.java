public class ClassExample {
    public static void main(String[] args) {
        String s = new String(); // String 클래스의 기본 생성자를 사용하여 빈 문자열 객체를 생성
        Class c = s.getClass(); // getClass() 메서드 반환형은 Class
        // s가 참조하는 문자열 객체의 클래스 타입 정보를 가져오는 코드
        // Object에 정의된 getClass() 메서드는 모든 클래스가 사용할 수 있는 메서드
        // 이 메서드를 사용하려면 이미 생성된 인스턴스가 있어야 함
        System.out.println(c); // 출력: class java.lang.String

        Class c2 = String.class;
        System.out.println(c2); // 출력: class java.lang.String
    }
}
