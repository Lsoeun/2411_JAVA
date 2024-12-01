package overriding;

public class OverrideTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound("멍멍"); // 하위 클래스에서 재정의한 메서드가 호출(생성된 인스턴스는 Dog이므로)
        // dog.fetch("공"); // 하위 클래스에서 추가로 정의한 메서드는 호출할 수 없음(inheritance.Animal 형이므로)
        dog.name = "개"; // 상위 클래스의 멤버 변수에만 접근할 수 있음(inheritance.Animal 형이므로)
        // dog.dogName = "치와와"; // 하위 클래스의 멤버 변수에 접근할 수 없음(inheritance.Animal 형이므로)

        Dog dog2 = new Dog();
        dog.makeSound("멍멍멍"); // 하위 클래스에서 재정의된 메서드 호출(inheritance.Dog 형이므로)
        dog2.fetch("공"); // 하위 클래스에서 추가로 정의한 메서드 호출(inheritance.Dog 형이므로)
        dog2.name = "개"; // 상위 클래스의 멤버 변수 접근 가능
        dog2.dogName = "비숑"; // 하위 클래스의 멤버 변수 접근 가능

        Animal animal = new Animal();
        animal.makeSound("소리"); // 상위 클래스에 정의된 메서드가 호출(생성된 인스턴스는 Animal이므로)
        // animal.fetch("공"); // 하위 클래스에서 추가로 정의한 메서드는 상위 클래스에서 호출할 수 없음
        animal.name = "동물이름"; // 상위 클래스의 멤버 변수만 접근 가능(inheritance.Animal 형이므로)
        // animal.dogName = "불독"; // 상위 클래스에서 하위 클래스의 멤버변수에 접근할 수 없음
    }
}
