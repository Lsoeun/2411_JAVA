public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        // Customer 클래스형인 customer를 Buy 인터페이스형인 buyer에 대입하여 형 변환,
        // buyer는 Buy 인터페이스의 메서드만 호출 가능
        Buy buyer = customer;
        buyer.buy();
        buyer.order(); // 재정의된 메서드 호출됨

        // Customer 클래스형인 customer를 Sell 인터페이스형인 seller에 대입하여 형 변환,
        // seller는 Sell 인터페이스의 메서드만 호출 가능
        Sell seller = customer;
        seller.sell();
        seller.order(); // 재정의된 메서드 호출됨

        if (seller instanceof Customer) {
            // seller를 하위 클래스형인 Customer로 다시 형 변환
            Customer customer2 = (Customer)seller;
            customer2.buy();
            customer2.sell();
            customer2.order(); // 재정의된 메서드 호출됨
        }
    }
}
