public class PasswordValidator {

    public void validatePassword(String password) throws PasswordException {
        if (password == null) {
            throw new PasswordException("비밀번호는 null일 수 없습니다.");
            // 비밀번호가 null인 경우 예외 발생
        }
        if (password.length() < 5) {
            throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
            // 비밀번호가 5자 미만인 경우 예외 발생
        }
        if (!password.matches("[a-zA-Z0-9]*")) {
            throw new PasswordException("비밀번호는 문자열과 숫자로만 이루어져야 합니다.");
            // 문자열로만 이루어지지 않은 경우 예외 발생
        }

        System.out.println("비밀번호가 유효합니다: " + password);
        // 모든 조건을 통과한 경우
    }
}

