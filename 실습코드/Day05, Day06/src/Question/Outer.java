package Question;

public class Outer { // 외부 클래스
    private String outerField = "Outer Field";

    // 내부 클래스
    public class InnerClass {
        void display() {
            System.out.println("Inner Class: " + outerField);
        }
    }
}