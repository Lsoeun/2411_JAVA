import java.util.List;

public class GenericMethodExample {
    // 제네릭 메서드 정의: 배열의 요소를 출력
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "World"};

        // 제네릭 메서드 호출: 다양한 타입의 배열을 전달
        printArray(intArray); // [1 2 3 4 5]
        printArray(strArray);  // [Hello World]

        List<String> stringList = List.of("apple", "banana", "cherry");
        List<Integer> integerList = List.of(1, 2, 3);

        printList(stringList);
        printList(integerList);
    }
}
