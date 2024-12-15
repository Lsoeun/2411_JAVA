public class IntegerExample {
    public static void main(String[] args) {
        // Integer 객체 생성 시 valueOf() 메서드 사용
        Integer num = Integer.valueOf(100); // 100을 가진 Integer 객체 생성
        System.out.println(num.intValue()); // 100 출력

        // Integer 객체의 내부 값은 변경 불가. 아래 코드는 에러 발생!
        // num.value = 200; // 에러! 'value'는 final 변수이므로 변경할 수 없습니다.

        Integer iValue = Integer.valueOf(100); // 100을 가진 Integer 객체 생성
        int myValue = iValue.intValue(); // 객체에서 int 값 가져오기
        // myValue는 100이 됩니다.
        System.out.println(myValue);

        Integer number1 = Integer.valueOf("100");
        Integer number2 = Integer.valueOf(100);
        System.out.println(number1 == number2);

        int num2 = Integer.parseInt("100");
        System.out.println(num2);
    }
}
