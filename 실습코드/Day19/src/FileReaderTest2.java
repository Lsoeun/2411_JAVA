import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("ex.txt")) {
            int ch;
            // 파일을 한 문자씩 읽음
            while ((ch = fr.read()) != -1) { // -1은 파일의 끝(EOF)을 의미
                System.out.print((char) ch); // 읽은 문자를 출력
            }
        } catch (IOException e) {
            // 파일 읽기 중 예외 발생 시 처리
            e.printStackTrace();
        }

        System.out.println("\n파일 읽기가 완료되었습니다.");
    }
}
