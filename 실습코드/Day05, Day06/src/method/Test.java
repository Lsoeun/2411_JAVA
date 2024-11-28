package method;

public class Test {
    // 문제 1: "Hello, World!"를 출력하는 메서드
    public void printHello() {
        System.out.println("Hello, World!");
    }

    // 문제 2: 두 숫자를 더해서 출력하는 메서드
    public void addNumber(int a, int b) {
        System.out.println("두 숫자의 합: " + (a + b));
    }

    // 문제 3: "안녕하세요!"라는 문자열을 반환하는 메서드
    public String getGreeting() {
        return "안녕하세요!";
    }

    // 문제 4: 두 개의 실수를 더한 결과를 반환하는 메서드
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // 메인 메서드: 각 메서드를 호출하여 결과를 출력
    public static void main(String[] args) {

        Test test = new Test();

        // 문제 1
        test.printHello(); // 출력: Hello, World!

        // 문제 2
        test.addNumber(5, 10); // 출력: 두 정수의 합

        // 문제 3
        String greeting = test.getGreeting();
        System.out.println(greeting); // 출력: 안녕하세요!

        // 문제 4
        double sum = test.add(1.5, 3.0);
        System.out.println("두 실수의 합: " + sum); // 출력: 두 실수의 합
    }
}
