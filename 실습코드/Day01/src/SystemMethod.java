public class SystemMethod {
    public static void main(String[] args) {
        System.out.println(10 + 10);
        System.out.println("10" + "10");
        System.out.println("안" + "녕");
        System.out.println("안" + 10);
        System.out.println("안" + 10 + 20);
        System.out.println("안" + (10 + 20));
        System.out.println("안" + 10 * 20);

        // "안" + 10 = 안10
        // "안" + "10" -> "안10"
        // 문자 -> 숫자로 변한게 아닌 숫자 -> 문자로 변한 것
        // 10이 문장으로 변했다. "10"
        // 형 변환: 기존 형에서 다른 형으로 변환시킨다.
    }
}
