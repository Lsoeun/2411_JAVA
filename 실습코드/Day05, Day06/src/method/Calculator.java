package method;

public class Calculator {
    public void plus(int a, int b) { // 매개변수(parameter)
        int c = 20; // 일반 지역변수
        System.out.println(a + b + c);
    }

    public void minus(int a, int b) { // 매개변수(parameter)
        int c = 20; // 일반 지역변수
        System.out.println(a - b - c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.plus(10, 20); // 인자값(argument)
        calculator.plus(15, 25);
        calculator.plus(5, 10);
    }
}
