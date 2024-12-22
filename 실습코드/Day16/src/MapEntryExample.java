import java.util.HashMap;
import java.util.Map;

public class MapEntryExample {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("사과", 1000);
        fruitPrices.put("바나나", 800);

        // entrySet()을 통해 모든 항목에 접근
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + "의 가격은 " + entry.getValue() + "원입니다.");
        }
    }
}