public class BankThreadEx2 {
    public static void main(String[] args) {
        Bank2 b = new Bank2();
        Thread th1 = new Thread(new AddThread2("1번 ", b));
        Thread th2 = new Thread(new AddThread2("2번 ", b));
        th1.start();
        th2.start();
    }
}
