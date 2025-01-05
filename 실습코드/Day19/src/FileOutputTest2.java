import java.io.FileOutputStream;
import java.io.IOException;

// 기존 방식 (명시적으로 close() 호출)
public class FileOutputTest2 {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("output2.txt", true);
            fos.write(65);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close(); // 리소스를 명시적으로 닫음
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
