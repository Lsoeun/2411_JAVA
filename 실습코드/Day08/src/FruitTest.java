public class FruitTest {
    public static void main(String[] args) {
        Fruit getFruit = new Fruit(1005, "수박");

        System.out.println(getFruit);
        Fruit test = getFruit.getSelf();
        System.out.println(test);
    }
}
