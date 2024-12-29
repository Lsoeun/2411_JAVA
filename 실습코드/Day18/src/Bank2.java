public class Bank2 {
    private int money;

    public int getMoney() {
        return money;
    }

    public synchronized void addMoney(int money) { // addMoney() 메서드 동기화
        this.money += money;
    }
}
