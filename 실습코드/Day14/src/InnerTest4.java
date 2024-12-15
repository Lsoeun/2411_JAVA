public class InnerTest4 {
    public static void main(String[] args) {
        OuterClass5 out = new OuterClass5();

        Runnable runnable = out.getRunnable(10);
        runnable.run();

        Runnable runner = out.runner;
        runner.run();
    }
}
