public class OuterClass {
    private String outerField = "외부 클래스 필드";

    class InnerClass {
        private String innerField = "내부 클래스 필드";

        public void display() {
            System.out.println("내부 클래스에서: " + outerField);
            System.out.println("내부 클래스 필드: " + innerField);
        }
    }

    public void createInner() {
        InnerClass inner = new InnerClass(); // 내부 클래스 객체 생성
        inner.display(); // 내부 클래스 메서드 호출
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass(); // 외부 클래스 객체 생성
        outer.createInner(); // 내부 클래스 객체 생성 후 메서드 호출
    }
}
