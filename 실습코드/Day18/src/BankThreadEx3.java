public class BankThreadEx3 {
    public static void main(String[] args) {
        Bank3 b = new Bank3();
        Thread th1 = new Thread(new AddThread3("1번 ", b));
        Thread th2 = new Thread(new AddThread3("2번 ", b));
        th1.start();
        th2.start();
    }
}
