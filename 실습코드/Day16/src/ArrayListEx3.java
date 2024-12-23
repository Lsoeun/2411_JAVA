import java.util.ArrayList;
import java.util.List;

public class ArrayListEx3 {
    public static void main(String[] args) {
        // ArrayList 생성 및 초기 데이터 추가
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 특정 인덱스의 데이터 가져오기
        String firstFruit = fruits.get(0); // 첫 번째 데이터
        String secondFruit = fruits.get(1); // 두 번째 데이터
        String thirdFruit = fruits.get(2); // 세 번째 데이터

        // 출력
        System.out.println("첫 번째 과일: " + firstFruit);
        System.out.println("두 번째 과일: " + secondFruit);
        System.out.println("세 번째 과일: " + thirdFruit);
    }
}
