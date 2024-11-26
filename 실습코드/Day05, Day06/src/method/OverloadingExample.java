package method;

public class OverloadingExample {
    // 두 정수를 더하는 메서드
    public int add(int a, int b) {
        return a + b;
    }

    // 세 정수를 더하는 메서드
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 두 실수를 더하는 메서드
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();

        // 메서드 호출
        int sum1 = example.add(5, 10);          // 두 정수
        int sum2 = example.add(5, 10, 15);    // 세 정수
        double sum3 = example.add(5.5, 10.5);   // 두 실수

        // 결과 출력
        System.out.println("두 정수의 합: " + sum1);    // 15
        System.out.println("세 정수의 합: " + sum2);    // 30
        System.out.println("두 실수의 합: " + sum3);    // 16.0
    }
}
