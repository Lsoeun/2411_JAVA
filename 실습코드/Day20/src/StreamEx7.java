import java.util.*;
import java.util.stream.*;

public class StreamEx7 {
    public static void main(String[] args) {
        // 문자열 배열 생성
        String[] arr = new String[]{"a", "b", "c"};

        // 배열에서 스트림을 생성하고 모든 값을 출력
        Stream<String> stream = Arrays.stream(arr);  // 배열에서 스트림을 생성
        stream.forEach(System.out::println);  // 배열의 모든 값을 출력
    }
}