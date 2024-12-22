import java.util.*;

public class ArrayListEx1 {
    // ArrayList는 가장 많이 사용하는 List 인터페이스의 대표적인 구현 클래스
    // 내부적으로 배열을 이용해 구현되어 배열과 호환성이 좋음
    public static void main(String[] args) {
        // 리스트 선언
        List<String> list = new ArrayList<>();

        // 데이터 삽입
        list.add("딸기");
        list.add("바나나");
        list.add("망고");

        // 리스트 출력
        System.out.println("리스트 내용: " + list);

        // 3번째 위치에 삽입
        list.add(2, "수박");

        // 결과 확인
        System.out.println("리스트 내용: " + list);

        // ArrayList 데이터 변경
        // void set(int index, E value);

        // 데이터 변경
        list.set(1, "복숭아");
        list.set(0, "포도");

        // 결과 확인
        System.out.println("리스트 내용: " + list);
    }
}
