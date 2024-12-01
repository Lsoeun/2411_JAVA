package inheritance;

public class Child extends Parent {
    int a = 5; // 자식 클래스의 멤버변수 a

    public void setParentA(int value) {
        super.a = value; // 부모 클래스의 멤버변수 a에 접근하여 값 설정
    }

    public void printValue() {
        System.out.println("inheritance.Child a: " + this.a);
        System.out.println("inheritance.Parent a: " + super.a);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.printValue();

        child.a = 2; // 자식 클래스의 멤버변수 a의 값을 변경
        child.setParentA(20); // 부모 클래스의 멤버변수 a의 값을 20으로 변경
        child.printValue(); // 변경된 결과 확인
    }
}
