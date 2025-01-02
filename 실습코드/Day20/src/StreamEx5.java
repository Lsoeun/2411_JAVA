import java.util.*;

public class StreamEx5 {
    public static void main(String[] args) {
        // 정수 리스트 생성
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 스트림을 생성하고 짝수만 필터링하여 출력
        numbers.stream()  // 리스트에서 스트림을 생성
                .filter(n -> n % 2 == 0)  // 짝수만 필터링
                .forEach(System.out::println);  // 필터링된 값을 출력
    }
}
