public class PasswordException extends Exception {
        public PasswordException(String message) {
            super(message); // 상위 클래스인 Exception의 생성자를 호출하여 메시지를 전달
        }
    }
