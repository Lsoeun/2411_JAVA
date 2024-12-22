import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("사과", 1000);
        fruitPrices.put("바나나", 800);

        // 키를 통해 값에 접근
        System.out.println("사과의 가격은 " + fruitPrices.get("사과") + "원입니다.");
        System.out.println("바나나의 가격은 " + fruitPrices.get("바나나") + "원입니다.");
    }
}