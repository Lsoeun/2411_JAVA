import java.util.ArrayList;
import java.util.List;

public class WithGenerics {
    // 지네릭을 사용하여 모든 타입의 리스트를 출력하는 함수
    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item); // T는 리스트의 요소 타입
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        System.out.println("Integer List:");
        printList(integerList); // 지네릭을 사용하여 정수 리스트 출력

        System.out.println("String List:");
        printList(stringList); // 지네릭을 사용하여 문자열 리스트 출력
    }
}
