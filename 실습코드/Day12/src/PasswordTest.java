public class PasswordTest {
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();

        try {
            validator.validatePassword("1234"); // 5자 미만으로 예외 발생
        } catch (PasswordException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }

        try {
            validator.validatePassword(null); // null로 예외 발생
        } catch (PasswordException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }

        try {
            validator.validatePassword("password!"); // 문자열로만 이루어지지 않은 경우 예외 발생
        } catch (PasswordException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }

        try {
            validator.validatePassword("valid123"); // 유효한 비밀번호
        } catch (PasswordException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
