package polymorphism;

public class CastingTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        if (hAnimal instanceof Human) { // hAnimal 인스턴스 자료형이 Human형이라면
            Human human = (Human)hAnimal; // 인스턴스 hAnimal을 Human형으로 다운 캐스팅
        }

        //💡새로운 문법 등장
        Animal hAnimal2 = new Human();
        if (hAnimal2 instanceof Human human) { // 패턴 매칭 사용
            // 여기서 human은 자동으로 Human 타입으로 다운캐스팅
        }
    }
}
