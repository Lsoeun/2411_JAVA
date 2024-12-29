public class AddThread implements Runnable {
    private Bank b;
    private String name;

    public AddThread(String name, Bank b) { // 생성자
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
