public class AddThread3 implements Runnable {
    private Bank3 b;
    private String name;

    public AddThread3(String name, Bank3 b) { // 생성자
        this.name = name;
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (b) { // 쓰레드 실행 코드 동기화
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    b.addMoney(1000);
                    System.out.println(this.name + "현재 잔고 : " + b.getMoney());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
