import java.util.ArrayList;

public class WrapperClassExample {
    public static void main(String[] args) {
        // 기본 타입
        int number = 5;

        // Wrapper 클래스를 사용한 객체 생성
        Integer wrappedNumber = Integer.valueOf(number); // int를 Integer로 변환(Wrapper 클래스로 변환)

        // ArrayList에 Wrapper 객체 추가
        ArrayList<Integer> list = new ArrayList<>();
        list.add(wrappedNumber); // Integer 객체를 리스트에 추가

        // null 값 사용 예시
        Integer nullableInteger = null; // null 할당 가능
        System.out.println(nullableInteger); // 출력: null
    }
}
