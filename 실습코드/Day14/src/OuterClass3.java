public class OuterClass3 {
    private int num = 10; // 외부 클래스 private 변수
    private static int sNum = 20; // 외부 클래스 정적 변수
    private InClass inClass; // 내부 클래스 자료형 변수를 먼저 선언

    public OuterClass3() { // 외부 클래스 생성자
        inClass = new InClass(); // 외부 클래스가 생성된 후 내부 클래스 생성 가능
    }

    class InClass { // 인스턴스 내부 클래스
        int inNum = 100;  // 내부 클래스의 인스턴스 변수
        static int sInNum = 200;

        public void inTest() { // 인스턴스 내부 클래스의 메서드
            System.out.println(num + "(외부 클래스의 인스턴스 변수)");
            System.out.println(sNum + "(외부 클래스의 정적 변수)");
        }
    }

    public void usingClass() { // 외부 클래스 메서드
        inClass.inTest();
    }

    static class InStaticClass { // 정적 내부 클래스
        int inNum = 100; // 정적 내부 클래스의 인스턴스 변수
        static int sInNum = 200; // 정적 내부 클래스의 정적 변수

        public void inTest() { // 정적 내부 클래스의 일반 메서드
            //num += 10; // 외부 클래스의 인스턴스 변수는 사용할 수 없음
            System.out.println(inNum + "(정적 내부 클래스의 인스턴스 변수 사용)");
            System.out.println(sInNum + "(정적 내부 클래스의 정적 변수 사용)");
            System.out.println(sNum + "(외부 클래스의 정적 변수 사용)");
        }

        public static void sTest() { // 정적 내부 클래스의 정적 메서드
            // 외부 클래스와 내부 클래스의 인스턴스 변수는 사용할 수 없음
            //num += 10;
            //inNum += 10
            System.out.println(sNum + "(외부 클래스의 정적 변수 사용)");
            System.out.println(sInNum + "(정적 내부 클래스의 정적 변수 사용)");
        }
    }
}
