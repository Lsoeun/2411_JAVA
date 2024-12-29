import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest1 {
    public static void main(String[] args) {
        FileInputStream fis = null; // FileInputStream 객체를 null로 초기화
        try {
            fis= new FileInputStream("input.txt"); // input.txt 파일을 읽기 위해 FileInputStream 생성

            int i;
            //-1이 아닐때까지 계속 읽음
            while((i=fis.read()) != -1) { // 파일에서 하나의 바이트를 읽고 -1이 아닐 때까지 반복
                System.out.println((char)i); // 읽은 바이트를 문자로 변환하여 출력
            }

        } catch (IOException e) { // IO 예외 처리
            // TODO Auto-generated catch block
            e.printStackTrace();
            // 예외가 발생하면 스택 트레이스를 출력
        }finally {
            try {
                fis.close(); // FileInputStream을 닫음
            } catch (Exception e) { // 닫는 과정에서 예외가 발생할 경우 처리
                // TODO Auto-generated catch block
                e.printStackTrace();  // 스택 트레이스를 출력
            }
        }
        System.out.println("end"); // 프로그램 종료 메시지 출력
    }
//    input.txt 파일의 내용을 읽어 콘솔에 출력하고, 모든 작업이 끝난 후에는 "end"라는 메시지를 출력합니다.
//    파일이 정상적으로 읽히지 않거나 다른 문제가 발생할 경우 적절한 예외 처리를 통해 오류를 보고합니다.
}
