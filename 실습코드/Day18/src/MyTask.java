// Thread 클래스 상속하는 경우
public class MyTask extends Thread {
    public MyTask() {
        setName("myTask-1"); // setter 메서드 사용해 이름 지정 가능
    }

    @Override
    public void run() {
        // 쓰레드 내용 구현
    }

    public static void main(String[] args) {
        MyTask task = new MyTask(); // MyTask 객체 생성
        task.start();
    }
}
