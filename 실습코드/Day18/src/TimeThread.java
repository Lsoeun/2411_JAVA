public class TimeThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            // 1초마다 "쓰레드 출력"과 현재 반복 번호를 출력
            System.out.println("쓰레드 출력" + (i + 1));

            try {
                // 1초간 일시정지
                Thread.sleep(1000);
                } catch (InterruptedException e) {
                // sleep() 중 예외가 발생한 경우 처리
                System.out.println("sleep Error");
            }
        }
    }

    public static void main(String[] args) {
        TimeThread th = new TimeThread();
        th.start();
    }
}
