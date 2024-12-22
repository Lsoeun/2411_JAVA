package lambda;

public class MyCalculatorTest {
    public static void main(String[] args) {
        MyCalculator calcu = (x, y) -> x + y; // 람다식을 인터페이스형 calcu 변수에 대입
        int result = calcu.plus(20, 30); // 인터페이스형 변수로 메서드 호출

        System.out.println(result);
    }
}