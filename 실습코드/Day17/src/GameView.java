import java.util.Scanner;

// View
public class GameView { // 사용자와의 상호작용(입력 및 출력)을 담당하는 뷰 클래스

    // 사용자로부터 숫자를 입력받는 메서드
    public int getUserInput() {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받을 Scanner 객체 생성
        System.out.print("1부터 10까지의 숫자 중 하나를 입력하세요: "); // 입력 안내 메시지 출력
        return scanner.nextInt(); // 입력된 숫자를 반환
    }

    public void displayResult(boolean isCorrect) {
        if (isCorrect) { // 정답 여부 확인
            System.out.println("정답입니다!");
        } else {
            System.out.println("틀렸습니다. 다시 시도하세요.");
        }
    }
}