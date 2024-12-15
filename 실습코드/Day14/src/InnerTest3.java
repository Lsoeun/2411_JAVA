public class InnerTest3 {
    public static void main(String[] args) {
        OuterClass4 out = new OuterClass4();
        Runnable runner = out.getRunnable(10); // 메서드 호출
        runner.run();
    }
}
