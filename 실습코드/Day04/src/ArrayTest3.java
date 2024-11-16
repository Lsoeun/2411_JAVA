public class ArrayTest3 {
    public static void main(String[] args) {
        // 크기만 지정하여 배열 선언
        int[] numbers = new int[5];  // 크기는 5로 지정

        // 배열에 값 할당
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // 배열 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
