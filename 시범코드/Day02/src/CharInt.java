// char -> int로 형변환 (업캐스팅)
// 자동 형변환이므로 별다른 명시적인 캐스팅 없이 가능
public class CharInt {
    public static void main(String[] args) {
        char ch = 'A';  // 'A'는 유니코드 값 65
        int num = ch;  // char에서 int로 자동 형변환

        System.out.println("char 값: " + ch);  // 출력: char 값: A
        System.out.println("int 값: " + num);  // 출력: int 값: 65
    }
}
// char는 16비트의 크기를 가진 문자형이지만, int는 32비트 정수형이기 때문에
// char의 값을 int로 변환하면 유니코드 값(또는 아스키 코드 값)이 int로 표현됨

