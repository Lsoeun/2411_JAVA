import java.util.*;

public class StreamEx6 {
    public static void main(String[] args) {
        // 문자열 리스트 생성
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 스트림을 생성하고 각 이름의 길이를 출력
        names.stream()  // 리스트에서 스트림을 생성
                .map(name -> name.length())  // 각 이름의 길이를 계산
                .forEach(System.out::println);  // 계산된 길이를 출력
    }
}
