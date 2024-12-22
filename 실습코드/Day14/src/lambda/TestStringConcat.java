package lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        StringConCatImpl concat1 = new StringConCatImpl(); // 인터페이스를 구현한 객체를 클래스로 생성
        concat1.makeString(s1, s2); // 참조변수를 사용해 makeString() 메서드 호출
        
        StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
        concat2.makeString(s1, s2);

//        StringConcat concat2 = new StringConcat() {
//            @Override
//            public void concat(String s, String v) {
//                System.out.println(s + "," + v);  // 반환값은 없으므로 return 생략
//            }
//        }; // 원래는 이런 형태를 람다식으로 축약
    }
}
