import java.util.ArrayList;
import java.util.List;

public class WithoutGeneric {
    public static void main(String[] args) {
        List list = new ArrayList(); // 자료형을 지정하지 않음

        list.add("apple"); // 문자열 추가
        list.add(100);     // 정수 추가 (잘못된 자료형이 들어감)

        for (Object item : list) {
            // 실행할 때 자료형 오류 발생 가능
            String str = (String) item; // 정수형인 100을 문자열로 변환하려다 오류
            System.out.println(str);
        }
    }
}
