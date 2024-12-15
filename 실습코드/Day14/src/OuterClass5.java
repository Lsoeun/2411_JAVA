public class OuterClass5 {

    public Runnable getRunnable(int i) {
        int num = 100;

        return new Runnable() { // 익명 내부 클래스  Runnable 인터페이스 생성
            @Override
            public void run() {
                // 지역변수는 상수화 되므로 변경 불가
                // num = 200;
                // i = 10;

                System.out.println(i);
                System.out.println(num);
            }
        }; // 클래스 끝에 ;를 씀
    } // -> 클래스 이름을 빼고 클래스를 바로 생성하는 방법


    public Runnable runner = new Runnable() { // 익명 내부 클래스를 변수에 대입
        @Override
        public void run() {
            System.out.println("Runnable의 구현된 익명 클래스 변수");
        }
    }; // 클래스 끝에 ;를 씀. 인터페이스나 추상클래스형 변수를 선언하고 클래스를 생성해 대입하는 방법
}
