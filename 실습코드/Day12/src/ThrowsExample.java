import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile("test.txt"); // 파일을 읽으려고 시도
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류 발생: " + e.getMessage());
        }
    }

    static void readFile(String fileName) throws IOException { // main한테 처리 미룸
        // 이 메서드는 IOException을 발생시킬 수 있음
        throw new IOException("파일을 찾을 수 없습니다: " + fileName); // -> 호출한 곳에서 처리
    }
}
