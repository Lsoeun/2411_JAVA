public class Thread2 extends Thread { // Thread 클래스 상속
    @Override
    public void run() { // run() 메서드 재정의(구현)
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum = sum + (i + 1);
        }

        System.out.println("sum = " + sum);
        String threadName = Thread.currentThread().getName();
        // 시스템에서 정의한 쓰레드 이름 가지고 오기
        System.out.println("현재 쓰레드 이름 : " + threadName);
    }
}