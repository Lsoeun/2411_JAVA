// 산술 연산자 예제 2
public class Operation2 {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;

        int totalScore = mathScore + engScore; // 총점 구하기
        System.out.println(totalScore);

        double avgScore = totalScore / 2.0; // 평균 구하기
        System.out.println(avgScore);

        int result = 10 + 2 * 3 - 4 / 2;
        System.out.println(result); // 연산자 우선순위 알아보기

        int result2 = (10 + 2) * 3 - 4 / 2;
        System.out.println(result2); // 연산자 우선순위 알아보기
    }
}
