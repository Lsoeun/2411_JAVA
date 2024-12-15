public class InnerTest {
    public static void main(String[] args) {
        OuterClass2 outClass = new OuterClass2();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass(); // 내부 클래스 기능 호출
    }
}
