import java.util.List;

public class ListPrinter2 {
    // 지네릭을 사용해 모든 타입의 리스트를 출력하는 함수
    public static <T> void printList(List<T> list) {
        // 함수 이름 앞에 <T>를 붙여서, 이 함수가 지네릭 타입인 T를 사용할 것임을 선언
        // 이 함수는 List<T>라는 지네릭 타입의 리스트를 매개변수로 받음
        for (T item : list) { // item의 타입은 리스트의 자료형(T)에 따라 결정
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<String> stringList = List.of("apple", "banana", "cherry");

        System.out.println("Integer List:");
        printList(integerList);

        System.out.println("String List:");
        printList(stringList);
    }
}
