public class Thread3_1 {
    public static void main(String[] args) {
        Thread hello = new Thread(new Thread3());
        hello.start();
    }
}
