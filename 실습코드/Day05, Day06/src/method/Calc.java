package method;

public class Calc {
    // 매개변수가 정수 두 개인 경우
    public int addInt(int a, int b) {
        return a + b;
    }

    // 매개변수가 실수 두 개인 경우
    public double addDouble(double a, double b) {
        return a + b;
    }

    // 매개변수가 세 개인 경우
    public int addThree(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.addInt(5, 10));
        System.out.println(calc.addDouble(5.5, 10.2));
        System.out.println(calc.addThree(1, 2, 3));
    }
}
