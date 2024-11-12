// 문자 자료형 음수값 표현 실습
public class CharacterEx3 {
    public static void main(String[] args) {
        int a = 65;
        int b = -66;

        char a2 = 65;
        //char b2 = -66;
        // 문자형 변수에 음수를 넣으면 오류가 발생!!

        System.out.println((char) a); // 'A' 출력 (65에 해당하는 문자)
        // System.out.println((char) b); // 음수는 char로 변환할 수 없으므로 오류 발생
        System.out.println(a2);  // 'A' 출력 (65에 해당하는 문자)
    }
}
