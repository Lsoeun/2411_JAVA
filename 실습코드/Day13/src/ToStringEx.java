public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200, "개미");

        // 클래스 정보(클래스 이름, 주소 값)
        System.out.println(book1);

        // toString() 메서드로 인스턴스 정보(클래스 이름, 주소 값)를 보여 줌
        System.out.println(book1.toString());

        System.out.println(book1.bookNumber);
        System.out.println(book1.bookTitle);

        String str = new String("test");
        System.out.println(str); // test 출력됨
        Integer i1 = new Integer(100);
        System.out.println(i1); // 100 출력됨
    }
}
