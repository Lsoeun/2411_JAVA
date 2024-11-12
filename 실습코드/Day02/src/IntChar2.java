// 잘못된 int -> char
public class IntChar2 {
    public static void main(String[] args) {
        int num = 70000;  // char는 0부터 65535까지 표현 가능
        char ch = (char) num;  // 명시적 형변환

        System.out.println("int 값: " + num);  // 출력: int 값: 70000
        System.out.println("char 값: " + ch);  // 잘못된 문자 출력 (유니코드 범위 초과)
    }
}
// 위 코드에서 70000은 char로 변환할 수 없는 값이므로, 예상하지 못한 결과가 나옵니다.
