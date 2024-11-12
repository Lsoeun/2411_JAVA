// 유니코드 실습
public class CharacterEx2 {
    public static void main(String[] args) {
        char ch1 = '한';
        char ch2 = '\uD55C'; // 유니코드

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println((int)ch2); // 유니코드 값 출력 (U+D55C)
    }
}
