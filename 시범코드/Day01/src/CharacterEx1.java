// 문자 자료형 실습
public class CharacterEx1 {
    public static void main(String[] args) {
        char myChar = 'A';
        System.out.println(myChar);

        char ch1 = 'Z';
        System.out.println(ch1); // 문자 출력
        System.out.println((int)ch1); // 문자에 해당하는 정수 값(아스키 코드 값)출력

        char ch2 = 66; // 문자 자료형에 정수값 대입
        System.out.println(ch2); // 정수 값에 해당하는 문자 출력
        System.out.println((int)ch2); // 문자에 해당하는 정수 값(아스키 코드 값)출력

        int ch3 = 67; // 정수 자료형에 정수값 대입
        System.out.println(ch3); // 정수 값 출력
        System.out.println((char)ch3); // 정수 값에 해당하는 문자 출력
    }
}
