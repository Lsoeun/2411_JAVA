public class Book2 {
    int bookNumber;
    String bookTitle;

    Book2(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() { // toString() 메서드 재정의
        return bookTitle + "," + bookNumber;
    }
}
