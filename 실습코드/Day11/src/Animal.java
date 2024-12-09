public abstract class Animal {

    // 일반 메서드 (구현이 되어 있음)
    public void eat() {
        System.out.println("이 동물은 음식을 먹습니다.");
    }

    // 추상 메서드 (구현하지 않고 선언만 함)
    public abstract void sound();  // 소리를 내는 메서드
}