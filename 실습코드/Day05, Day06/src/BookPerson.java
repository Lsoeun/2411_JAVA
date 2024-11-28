public class BookPerson {
    String name;
    Book book;  // 속성: BookPerson 객체가 소유하는 책. Book 클래스의 참조 자료형

    // 기능: BookPerson이 책을 읽는 동작
    public void readBook() {
        book.read();  // BookPerson 객체가 Book 객체의 read() 메서드 호출
    }
}
