// Runnable 인터페이스 구현하는 경우
public class MyTask2 {
    public static void main(String[] args) {
        Runnable task = () -> {
            // 쓰레드 내용 구현
        };
        Thread myThread = new Thread(task);
        myThread.setName("Thread-blue"); // Thread 이름 설정
        myThread.start();
    }
}
