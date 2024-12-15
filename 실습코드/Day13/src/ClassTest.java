import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Person person = new Person("이름");
        Class pClass1 = person.getClass();  //Object 의 getClass() 메서드 사용
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class;    // 직접 class 파일 대입
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("Person"); // 클래스 이름으로 가져오기
        System.out.println(pClass3.getName());
        //이름과 일치하는 클래스가 없는경우 ClassNotFoundException 발생함

        // Person 객체의 정보 출력
        System.out.println("클래스 이름: " + pClass1.getName());
        System.out.println("상위 클래스: " + pClass1.getSuperclass().getName());

        // 필드 정보 출력
        System.out.println("필드 목록:");
        for (Field field : pClass1.getDeclaredFields()) {
            System.out.println(field.getName());

            // 메서드 정보 출력
            System.out.println("메서드 목록:");
            for (Method method : pClass1.getDeclaredMethods()) {
                System.out.println(method.getName());
            }
        }
    }
}
