package method;

public class MethodExamples2 {
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static int sum2(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        sum(10, 6);

        System.out.println(sum2(10, 6));
        int result = sum2(10, 6);
        System.out.println(result);
    }
}
