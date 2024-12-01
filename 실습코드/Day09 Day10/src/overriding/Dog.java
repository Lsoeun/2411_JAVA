package overriding;

public class Dog extends Animal{
    String dogName;

    @Override
    public void makeSound(String sound) {
        System.out.println("재정의 Dog makes sound: " + sound);
    }

    public void fetch(String item) {
        System.out.println("Dog fetches: " + item);
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound("멍멍");
    }
}