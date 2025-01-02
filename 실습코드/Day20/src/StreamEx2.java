// Stream 활용
import java.util.Arrays;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        // // 문자열을 담은 리스트 생성 (Arrays.asList() 메서드 사용하여 리스트 생성)
        List<String> list = Arrays.asList("Lee", "Park", "Kim");
        // Stream 활용
        list.stream().forEach(name -> System.out.println(name));
        // 리스트에서 스트림을 생성하고, 스트림의 각 요소에 대해 forEach() 메서드를 사용하여 출력
        list.stream().forEach(System.out::println);
        // 동일한 역할의 코드
    }
}
