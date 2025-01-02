import java.util.*;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 스트림 생성
        Stream<String> nameStream = names.stream();

        // 첫 번째 사용: 길이가 3보다 큰 이름만 필터링하고 출력
        nameStream.filter(name -> name.length() > 3)
                .forEach(System.out::println);

        // 두 번째 사용: 같은 스트림을 재사용하려고 시도
        // 스트림은 한 번만 사용할 수 있기 때문에 아래에서 IllegalStateException 예외가 발생
        nameStream.filter(name -> name.startsWith("A"))
                .forEach(System.out::println); // IllegalStateException 발생
    }
}