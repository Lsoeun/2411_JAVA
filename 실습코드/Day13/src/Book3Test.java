public class Book3Test {
    public static void main(String[] args) {
        Book3 book = new Book3("제목", "저자", "출판사");
        System.out.println(book.toString());
        System.out.println(book.hashCode());
        System.out.println(System.identityHashCode(book));
    }
}
