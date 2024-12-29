public class AddThread2 implements Runnable {
    private Bank2 b;
    private String name;

    public AddThread2(String name, Bank2 b) { // 생성자
        this.name = name;
        this.b = b;
    }

    @Override
    public void run() {
        try{
            for(int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                b.addMoney(1000);
                System.out.println(this.name + "현재 잔고 : " + b.getMoney());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
