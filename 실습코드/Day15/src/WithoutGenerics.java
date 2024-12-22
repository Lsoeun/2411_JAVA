import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {
    // 정수 리스트 출력
    public static void printIntegerList(List list) {
        for (Object item : list) {
            // Object에서 Integer로 캐스팅
            Integer number = (Integer) item; // 잘못된 타입이 들어오면 오류 발생 가능
            System.out.println(number);
        }
    }

    // 문자열 리스트 출력
    public static void printStringList(List list) {
        for (Object item : list) {
            // Object에서 String으로 캐스팅
            String text = (String) item; // 잘못된 타입이 들어오면 오류 발생 가능
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        List strings = new ArrayList();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");

        System.out.println("Integer List:");
        printIntegerList(numbers); // 실행 중에 잘못된 타입이 들어가면 오류 발생 가능

        System.out.println("String List:");
        printStringList(strings); // 실행 중에 잘못된 타입이 들어가면 오류 발생 가능
    }
}
