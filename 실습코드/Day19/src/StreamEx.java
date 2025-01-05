import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class StreamEx {
    public static void main(String[] args) {
        // 기반 스트림: FileInputStream
        try (FileInputStream fis = new FileInputStream("ex.txt");
             // 보조 스트림: BufferedInputStream (기반 스트림을 감싸서 성능 향상)
             BufferedInputStream bis = new BufferedInputStream(fis)) {

            int data;
            // 데이터를 한 바이트씩 읽기
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);  // 읽은 바이트를 문자로 출력
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
