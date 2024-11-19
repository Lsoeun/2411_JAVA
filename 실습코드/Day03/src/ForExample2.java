public class ForExample2 {
    public static void main(String[] args) {
        int i; // 반복 횟수와 관련된 i
        int sum = 0; // 합계가 누적될 값을 담을 sum
        for (i = 1; i <= 10; i++) {
            sum += i; // sum = sum + i
        }

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
