public class InnerTest2 {
    public static void main(String[] args) {
        OuterClass3 outClass = new OuterClass3(); // 외부 클래스 객체 생성
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass(); // 내부 클래스 기능 호출
        System.out.println();

        OuterClass3.InStaticClass sInClass = new OuterClass3.InStaticClass();
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();
        System.out.println();

        System.out.println("정적 내부 클래스의 정적 메서드 호출");
        OuterClass3.InStaticClass.sTest();
    }
}
