import java.util.List;

public class ListPrinter {
    // 정수 리스트 출력
    public static void printIntegerList(List<Integer> list) {
        for (Integer item : list) {
            System.out.println(item);
        }
    }

    // 문자열 리스트 출력
    public static void printStringList(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}
