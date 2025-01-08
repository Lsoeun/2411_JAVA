public class SystemErrTest {
    public static void main(String[] args) {
        try {
            // 잘못된 숫자 형 변환 예시
            String invalidNumber = "abc";
            int number = Integer.parseInt(invalidNumber);
        } catch (NumberFormatException e) {
            // 오류 메시지를 System.err에 출력
            System.err.println("잘못된 숫자 형식: " + e.getMessage());
        }
    }
}
