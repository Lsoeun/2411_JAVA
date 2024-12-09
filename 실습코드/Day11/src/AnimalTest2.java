public class AnimalTest2 {
    public static void main(String[] args) {
        // 다형성을 활용하여 Animal 타입의 Cat과 Dog 객체 생성
        Animal cat = new Cat(); // Cat 인스턴스
        Animal dog = new Dog(); // Dog 인스턴스

        // 메서드 호출
        cat.sound();  // 출력: 야옹
        dog.sound();  // 출력: 멍멍
    }
}
