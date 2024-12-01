public class MyClass {
    private int x;
    private int y;

    // 1. 기본 값이 설정된 생성자
    public MyClass() {
        this(0, 0); // 첫 번째 생성자에서 this()로 세 번째 생성자를 호출
    }

    // 2. x만 초기화하는 생성자
    public MyClass(int x) {
        this(x, 0); // 두 번째 생성자에서도 this()로 세 번째 생성자를 호출
    }

    // 3. x와 y 모두 초기화하는 생성자
    public MyClass(int x, int y) {
        this.x = x;
        this.y = y; // 실제 x와 y를 초기화
    }

    public void showClass() {
        System.out.println("X값:" + x +" "+ "Y값:" + y);
    }

    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass(10);
        MyClass myClass3 = new MyClass(10, 20);

       myClass1.showClass();
       myClass2.showClass();
       myClass3.showClass();
    }
}