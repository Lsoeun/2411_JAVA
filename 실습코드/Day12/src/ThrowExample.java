public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(15); // 18세를 넘지 않아서 예외 발생
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("나이가 18세 미만입니다.");
        }
        System.out.println("나이에 문제가 없습니다.");
    }
}
