// 수정된 코드
import java.util.*;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 스트림 생성
        Stream<String> nameStream = names.stream();

        // 첫 번째 사용: 길이가 3보다 큰 이름만 필터링하고 출력
        nameStream.filter(name -> name.length() > 3)
                .forEach(System.out::println);

        // 스트림을 새로 생성하여 두 번째 사용
        // 같은 스트림 객체를 재사용하지 않고 새로 생성된 스트림을 사용
        nameStream = names.stream(); // 새 스트림 생성
        nameStream.filter(name -> name.startsWith("A"))
                .forEach(System.out::println); // 이제 예외가 발생하지 않습니다.
    }
}