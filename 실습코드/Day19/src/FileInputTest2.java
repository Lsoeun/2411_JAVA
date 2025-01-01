import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {
    public static void main(String[] args) {
        // try-with-resources 구문을 사용하여 FileInputStream을 생성하고 자동으로 리소스를 닫을 수 있게 처리
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            // 파일에서 읽은 데이터를 저장할 변수
            int i;

            // fis.read()는 한 번에 하나의 바이트를 읽고, 파일의 끝을 만나면 -1을 반환
            // -1이 아닐 때까지 파일을 읽어서 화면에 출력
            while ((i = fis.read()) != -1) {
                // 읽은 바이트 값을 문자로 변환하여 출력
                System.out.print((char) i);
            }
        } catch (IOException e) {
            // 파일 읽기 또는 다른 IO 오류가 발생했을 때 예외 처리
            e.printStackTrace(); // 예외 발생 시 스택 트레이스를 출력
        }

        // 프로그램 실행이 완료되었음을 나타내는 메시지 출력
        System.out.println();
        System.out.println("end");
    }
}