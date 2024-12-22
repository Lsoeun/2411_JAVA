import java.util.HashMap;
import java.util.Map;
public class MapExample {
    public static void main(String[] args) {
        // Map 인터페이스의 구현체로 HashMap 사용
        Map<String, Integer> fruitPrices = new HashMap<>();

        // 요소 추가
        fruitPrices.put("apple", 1000);
        fruitPrices.put("banana", 800);
        fruitPrices.put("orange", 1200);

        // 특정 키의 값 가져오기
        System.out.println("Price of apple: " + fruitPrices.get("apple")); // 1000

        // 맵의 크기 확인
        System.out.println("Number of fruit prices: " + fruitPrices.size()); // 3

        // 키가 존재하는지 확인
        if (fruitPrices.containsKey("banana")) {
            System.out.println("Banana is in the map.");
        }

        // 값 제거
        fruitPrices.remove("orange");
        System.out.println("Prices after removing orange: " + fruitPrices);

        // 모든 키와 값 출력
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 맵 비우기
        fruitPrices.clear();
        System.out.println("Number of fruit prices after clearing: " + fruitPrices.size()); // 0
    }
}
