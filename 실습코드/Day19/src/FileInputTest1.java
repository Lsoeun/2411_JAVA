import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest1 {
    public static void main(String[] args) {
        FileInputStream fis = null; // 파일 입력 스트림을 위한 참조 변수 초기화

        try {
            // "input.txt" 파일을 읽기 위한 FileInputStream 객체 생성
            fis = new FileInputStream("input.txt"); // input.txt 파일 입력 스트림 생성
            // 파일에서 데이터를 한 바이트씩 읽어와 문자로 변환 후 출력
            // 파일이 존재하지 않거나 접근 권한 문제가 있을 경우 IOException이 발생
            System.out.println((char)fis.read()); // 첫 번째 바이트 읽기(fis.read()는 파일의 내용을 한 바이트씩 읽어 int로 반환)
            System.out.println((char)fis.read()); // 두 번째 바이트 읽기
            System.out.println((char)fis.read());// 세 번째 바이트 읽기
        } catch (IOException e) {
            // 파일 읽기 중 예외 발생 시 처리
            System.out.println(e);
        } finally {
            // 리소스 해제를 위해 FileInputStream 닫기
            try {
                fis.close(); // 스트림 닫기
            } catch (IOException e) {
                // 스트림 닫기 중 예외 발생 시 처리
                System.out.println(e);
            } catch (NullPointerException e) {
                // fis가 null인 경우(스트림이 생성되지 않은 경우) 예외 처리
                System.out.println(e);
            }
        }
        // 프로그램 종료 메시지 출력
        System.out.println("end");
    }
}
