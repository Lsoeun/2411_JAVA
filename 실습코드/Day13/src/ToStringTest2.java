public class ToStringTest2 {
    public static void main(String[] args) {
        Book2 book1 = new Book2(200, "개미");

        // 재정의된 toString() 메서드 호출됨
        System.out.println(book1);

        // 재정의된 toString() 메서드 호출됨
        System.out.println(book1.toString());
    }
}
