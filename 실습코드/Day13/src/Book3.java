import java.util.Objects;

public class Book3 {
    private String title;
    private String author;
    private String publisher;

    public Book3(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book3{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher); // title, author, publisher의 값을 기반으로 생성된 해시 코드를 반환
    }
}
