package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 기존 방식
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }

        // 람다식과 스트림 사용
        names.stream()
                .filter(name -> name.startsWith("A")) // "A"로 시작하는 이름 필터링
                .forEach(System.out::println);
    }
}

//    int add(int x, int y) {
//        return x + y;
//    }

    // 위의 메서드를 람다 표현식을 이용해 아래와 같이 단축 시킬수 있다. (메서드 반환 타입, 메서드 이름 생략)
//    (int x, int y) -> {
//            return x + y;
//        };
//
//    // 매개변수 타입도 생략 할 수 있다.
//    (x, y) -> {
//            return x + y;
//        };
//
//    // 함수에 리턴문 한줄만 있을 경우 더욱 더 단축 시킬 수 있다. (중괄호, return 생략)
//    (x, y) -> x + y;
//    }
