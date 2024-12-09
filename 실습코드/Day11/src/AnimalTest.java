public class AnimalTest {
    public static void main(String[] args) {
// Animal animal = new Animal();  // 에러! 추상 클래스는 인스턴스화할 수 없음

        // Cat과 Dog 객체 생성
        Cat cat = new Cat();
        Dog dog = new Dog();

        // 메서드 호출
        cat.eat();    // 출력: 이 동물은 음식을 먹습니다.
        cat.sound();  // 출력: 야옹

        dog.eat();    // 출력: 이 동물은 음식을 먹습니다.
        dog.sound();  // 출력: 멍멍
    }
}
