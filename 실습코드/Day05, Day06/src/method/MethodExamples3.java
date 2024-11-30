package method;

public class MethodExamples3 {

    // 두 정수의 합을 반환하는 메서드
    public int sum(int a , int b) {
        return a + b;
    }

    // 두 정수의 합을 출력하는 메서드(반환값 없음)
    public void add(int a, int b) {
        System.out.println(a + b);
    }


    public static void main(String[] args) {
        MethodExamples3 method = new MethodExamples3();

        // sum 메서드 호출 후 결과 출력
        int result = method.sum(10, 5); // 반환값을 변수에 저장
        System.out.println(result); // sum의 반환값을 변수에 넣어 출력
        System.out.println(method.sum(10, 5));

        // add 메서드 호출
        method.add(10, 10); // 결과는 콘솔창에 출력됨
    }
}
