// 추상 클래스를 상속받는 Dog 클래스
public class Dog extends Animal {
    // 추상 메서드 구현 (반드시 구현해야 함)
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
