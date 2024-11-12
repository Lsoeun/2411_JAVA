// 변수 값 바꾸기 퀴즈
public class Variable5 {
    public static void main(String[] args) {
        int a = 123;
        int b = 456;

        // 수정 코드 작성 시작
        a = 456;
        b = 123;

        // 변수만 사용하면 이렇게 작성
        int c = a;
        a = b;
        b = c;
        // 수정 코드 작성 끝

        System.out.println("a :" + a);
        // a : 456
        System.out.println("b :" + b);
        // b : 123
    }
}
