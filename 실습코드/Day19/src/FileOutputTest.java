import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {
    public static void main(String[] args) {
        // true로 하면 txt파일에 기존 내용이 유지되고 새로운 문자가 추가됨
        try(FileOutputStream fos= new FileOutputStream("output.txt",true)){
            fos.write(65); // 'A'에 해당하는 ASCII 코드값 65를 파일에 씀
            fos.write(66); // 'B'에 해당하는 ASCII 코드값 66을 파일에 씀
            fos.write(67); // 'C'에 해당하는 ASCII 코드값 67을 파일에 씀

        }catch(IOException e) {
            System.out.println(e); // 입출력 예외 발생 시 예외 정보를 출력
        }
    }
}
