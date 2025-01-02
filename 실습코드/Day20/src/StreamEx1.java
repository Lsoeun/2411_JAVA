// 기존 방식
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {
        // 문자열을 담은 리스트 생성 (Arrays.asList() 메서드 사용하여 리스트를 생성)
        List<String> list = Arrays.asList("Lee", "Park", "Kim");

        // 기존 방식
        // 기존 방식으로 리스트의 각 요소를 순차적으로 출력하는 코드
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
