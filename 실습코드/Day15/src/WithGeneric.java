import java.util.ArrayList;
import java.util.List;

    public class WithGeneric {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>(); // 자료형을 String으로 지정

            list.add("apple"); // 문자열 추가
            // list.add(100);   // 컴파일 오류! 정수는 넣을 수 없음

            for (String item : list) {
                System.out.println(item);
            }
        }
}
