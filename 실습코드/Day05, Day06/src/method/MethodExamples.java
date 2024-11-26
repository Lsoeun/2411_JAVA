package method;

public class MethodExamples {
    public int sum(int a , int b) {
        int result = a + b + 2;
        return result;
    }

    public void sumPrint(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public String getName() {
        return "홍길동";
    }

    public static void todayWeather() {
        System.out.println("오늘의 날씨는 맑음");
    }
}
