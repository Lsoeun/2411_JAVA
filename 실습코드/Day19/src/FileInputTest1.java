import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest1 {
    public static void main(String[] args) {
        // 파일을 읽기 위해 FileInputStream 객체 생성
        try (FileInputStream fis = new FileInputStream("ex.txt")) {
            int byteData;

            // 파일에서 하나씩 바이트를 읽음
            while ((byteData = fis.read()) != -1) {
                // 읽은 바이트를 문자로 변환하여 출력
                System.out.print((char) byteData);
            }

        } catch (IOException e) {
            // 파일이 없거나 읽을 수 없을 때 예외 처리
            System.out.println("파일을 읽을 수 없습니다: " + e.getMessage());
        }
    }
}
