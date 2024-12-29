public class Thread1 {
    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();
        // 현재 실행 중인 쓰레드의 이름을 반환
        System.out.println("현재 쓰레드 이름: " + threadName);
        // 쓰레드 이름 출력
    }
}