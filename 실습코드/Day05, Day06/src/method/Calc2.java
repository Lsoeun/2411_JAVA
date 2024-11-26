package method;

public class Calc2 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calc2 calc = new Calc2();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5.5, 10.2));
        System.out.println(calc.add(1, 2, 3));
    }
}
