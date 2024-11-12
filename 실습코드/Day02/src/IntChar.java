// int 값을 char로 변환할 때는, 명시적인 형변환(캐스팅)을 해야 함
public class IntChar {
    public static void main(String[] args) {
        int num = 65;  // 'A'의 유니코드 값
        char ch = (char) num;  // int에서 char로 명시적 형변환

        System.out.println("int 값: " + num);  // 출력: int 값: 65
        System.out.println("char 값: " + ch);  // 출력: char 값: A
    }
}
// int -> char: 명시적 형변환이 필요하며, int 값이 0에서 65535 사이여야 합니다.
// 그 범위를 벗어나면 잘못된 문자가 나올 수 있습니다.
