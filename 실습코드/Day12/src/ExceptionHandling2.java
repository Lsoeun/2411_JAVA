import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt"); // 파일을 열기 위한 리소스
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return;
        } finally {
            if (fis != null) {
                try {
                    fis.close();  // 파일 입력 스트림 닫기. 파일 리소스를 닫는 colse() 메서드
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("항상 수행됩니다.");
        }
        System.out.println("여기도 수행됩니다.");
    }
}
