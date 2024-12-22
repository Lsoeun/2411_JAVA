// Controller
public class GameController { // 게임의 흐름을 제어하는 컨트롤러 클래스
    private GameModel model;
    private GameView view;

    public GameController(GameModel model, GameView view) { // 생성자
        this.model = model;
        this.view = view;
    }

    public void play() {
        while (true) { // 게임 루프: 사용자가 정답을 맞힐 때까지 반복
            int userGuess = view.getUserInput(); // 사용자로부터 숫자를 입력받음
            boolean result = model.isCorrect(userGuess); // 입력값이 정답인지 확인
            view.displayResult(result); // 결과를 사용자에게 출력

            if (result) break; // 정답을 맞췄다면 반복문 종료
        }
    }
}