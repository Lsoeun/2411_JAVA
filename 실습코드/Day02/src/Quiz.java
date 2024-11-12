// 형 변환 퀴즈
public class Quiz {
    public static void main(String[] args) {

        // char 타입 변수에 'C'를 할당하고, 이 값을 int 타입 변수에 저장한 후 출력하세요.
        char ch1 = 'C';   // 'C'는 유니코드 67
        int num1 = ch1;    // 자동 형변환
        System.out.println(num1);  // 출력: 67

        // int 타입 변수에 72를 할당하고, 이를 char 타입 변수로 형변환한 후 출력하세요.
        int num2 = 72;
        char ch2 = (char) num2;  // 명시적 형변환
        System.out.println(ch2);  // 출력: H

        // double 타입 변수에 3.14를 할당하고, 이를 int 타입 변수로 형변환한 후 출력하세요.
        double d3 = 3.14;
        int num3 = (int) d3;  // 소수점 버림 (명시적 형변환)
        System.out.println(num3);  // 출력: 3

        // float 타입 변수에 99.99f를 할당하고, 이를 double 타입 변수로 형변환한 후 출력하세요.
        float f4 = 99.99f;
        double d4 = f4;   // 자동 형변환
        System.out.println(d4);  // 출력: 99.99
    }
}
