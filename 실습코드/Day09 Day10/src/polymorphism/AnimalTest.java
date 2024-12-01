package polymorphism;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal eagle = new Eagle();
        Animal human = new Human();
        Animal tiger = new Tiger();

        animal.move();
        eagle.move();
        human.move();
        tiger.move();
    }
}
