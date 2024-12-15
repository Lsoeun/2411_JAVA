public class OuterClass2 { // 외부 클래스
    private int num = 10; // 외부 클래스 private 변수
    private static int sNum = 20; // 외부 클래스 정적 변수
    private InClass inClass; // 내부 클래스 자료형 변수를 먼저 선언

    public OuterClass2() { // 외부 클래스 생성자
        inClass = new InClass(); // 외부 클래스가 생성된 후 내부 클래스 생성 가능
    }

    class InClass { // 인스턴스 내부 클래스
        int inNum = 100;  // 내부 클래스의 인스턴스 변수
        static int sInNum = 200;
        // JDK15까지는 인스턴스 내부 클래스에 정적변수 선언이 불가능, JDK16부터는 가능

        public void inTest() { // 인스턴스 내부 클래스의 메서드
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
        }

        public static void sTest() {
            //JDK15까지는 인스턴스 내부 클래스에 정적메서드 선언이 불가능, JDK16부터는 가능
        }
    }

    public void usingClass() { // 외부 클래스 메서드
        inClass.inTest();
    }
}
