import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {
    public static void main(String[] args) {
        try( FileOutputStream fos= new FileOutputStream("output.txt",true)){
            // true로 하면 txt파일에 기존 내용이 유지되고 새로운 문자가 추가됨
            // FileOutputStream은 파일에 숫자를 쓰면 해당하는 아스키 값의 문자로 변환하여 저장
            fos.write(65); 
            fos.write(66); 
            fos.write(67);
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
