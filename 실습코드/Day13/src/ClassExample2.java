public class ClassExample2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c = Class.forName("java.lang.String");
        System.out.println(c);  // 출력: class java.lang.String
    }
}

// 해당 코드는 클래스의 정보를 동적으로 가져오는 리플렉션(Reflection) 기법을 사용하는 예제입니다.
// Class.forName() 메서드는 예외 처리가 필요합니다.
