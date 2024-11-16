public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // i가 5일 때 반복문을 종료
            }
            System.out.println(i);  // 1부터 4까지 출력
        }
    }
}