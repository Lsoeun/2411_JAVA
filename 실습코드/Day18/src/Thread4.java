public class Thread4 {
    public static void main(String[] args) {
        // Runnable을 람다식으로 구현
        Runnable task = () -> {
            while (true) {
                System.out.println("안녕하세요");
            }
        };

        // Runnable을 새로운 쓰레드로 실행
        Thread thread = new Thread(task);
        thread.start();
    }
}