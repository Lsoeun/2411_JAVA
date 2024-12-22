// Model
public class GameModel { // 게임의 로직과 데이터를 관리하는 모델 클래스
    private int targetNumber; // 정답 숫자를 저장하는 필드

    public GameModel() { // 생성자: 게임이 시작될 때 정답 숫자를 랜덤으로 생성
        this.targetNumber = (int) (Math.random() * 10) + 1;
        // Math.random()은 0.0 이상 1.0 미만의 난수를 생성
        // 여기에 10을 곱해 0부터 9.999...까지 만들고, 정수로 변환한 뒤 1을 더해 1부터 10 사이의 정수를 생성
    }

    // 사용자의 추측이 정답인지 확인하는 메서드
    public boolean isCorrect(int guess) {
        return guess == targetNumber;
        // 사용자의 입력값(guess)이 targetNumber와 같은지 비교하여 결과 반환
    }
}