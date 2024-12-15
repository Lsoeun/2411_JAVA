import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        // String 클래스의 Class 객체 가져오기
        Class<?> stringClass = String.class;
        // Class 객체의 정보 출력
        System.out.println("클래스 이름: " + stringClass.getName()); // String
        System.out.println("상위 클래스: " + stringClass.getSuperclass().getName());
        // Object

        // 필드와 메서드 정보 출력
        System.out.println("메서드 목록:");
        for (Method method : stringClass.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
    }
}
