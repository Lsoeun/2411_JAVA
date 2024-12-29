public class Thread3 implements Runnable { // Runnable 인터페이스 상속
    @Override
    public void run() { // run() 메서드 구현
        while (true) {
            System.out.println("안녕하세요");
        }
    }
}
