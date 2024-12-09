// 두 인터페이스를 구현하는 클래스
public class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void display() {
        System.out.println("MyClass의 display 메서드");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.display(); // 호출: MyClass의 display 메서드
    }
}
