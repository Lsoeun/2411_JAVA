import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 파일 끝까지 읽기(파일 끝에 도달할 때까지 반복해서 읽기)
public class FileInputTest2 {
    public static void main(String[] args) {
        FileInputStream fis = null; // FileInputStream 변수를 try 블록 외부에서 선언

        try {
            // FileInputStream을 생성하여 파일을 읽기 위한 준비
            fis = new FileInputStream("test.txt");

            // 파일에서 읽은 데이터를 저장할 변수
            int i;

            // fis.read()는 한 번에 하나의 바이트를 읽고, 파일의 끝을 만나면 -1을 반환
            // -1이 아닐 때까지 파일을 읽어서 화면에 출력
            while ((i = fis.read()) != -1) { // -1을 반환하게 되면 while문을 빠져나감
                // 읽은 바이트 값을 문자로 변환하여 출력
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            // 파일이 존재하지 않을 경우 발생하는 예외 처리
            e.printStackTrace(); // 예외 발생 시 스택 트레이스를 출력
        } catch (IOException e) {
            // 파일 읽기 또는 다른 IO 오류가 발생했을 때 예외 처리
            e.printStackTrace(); // 예외 발생 시 스택 트레이스를 출력
        } finally {
            // 리소스를 명시적으로 닫기 위해 finally 블록 사용
            try {
                if (fis != null) { // fis가 null이 아닌 경우에만 close 호출
                    fis.close(); // 파일 스트림 닫기
                }
            } catch (IOException e) {
                // 스트림 닫기 중 예외 발생 시 처리
                e.printStackTrace(); // 예외 발생 시 스택 트레이스를 출력
            }
        }

        // 프로그램 실행이 완료되었음을 나타내는 메시지 출력
        System.out.println();
        System.out.println("end");
    }
}