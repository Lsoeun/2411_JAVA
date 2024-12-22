import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        // Collection 인터페이스의 구현체로 ArrayList 사용
        Collection<String> fruits = new ArrayList<>();
        // ArrayList를 사용하여 Collection 타입의 객체를 생성

        // 컬렉션에 요소 추가
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // 요소 개수 출력
        System.out.println("Number of fruits: " + fruits.size()); // 3

        // 특정 요소 포함 여부 확인
        if (fruits.contains("banana")) {
            System.out.println("Banana is in the collection.");
        }

        // 요소 제거
        fruits.remove("orange");
        System.out.println("Number of fruits after removal: " + fruits.size()); // 2

        // 컬렉션이 비어 있는지 확인
        if (!fruits.isEmpty()) {
            System.out.println("The collection is not empty.");
        }

        // 모든 요소 출력
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 모든 요소 제거
        fruits.clear();
        System.out.println("Number of fruits after clearing: " + fruits.size()); // 0
    }
}
