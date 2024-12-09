import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        // FileNotFoundException 발생 가능
        Class c = Class.forName(className);
        // ClassNotFoundException 발생 가능
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("클래스를 찾을 수 없습니다: " + e.getMessage());
        }
    }
}