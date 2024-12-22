import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Controller
public class CalcController implements ActionListener {

    CalcView cv; // CalcView 객체를 컨트롤러에서 관리하기 위함
    
    CalcController() { // 생성자: 뷰를 초기화하고 버튼의 이벤트를 설정
        cv = new CalcView();
        cv.btn_plus.addActionListener(this); // "더하기" 버튼에 이벤트 리스너(this) 등록
        // this를 사용해 현재 컨트롤러 객체를 리스너로 지정
        // 사용자가 버튼을 클릭하면 actionPerformed 메서드가 호출
    }

    @Override
    public void actionPerformed(ActionEvent e) { // 버튼 클릭 시 실행되는 메서드
        if(e.getSource() == cv.btn_plus) { // 클릭된 버튼이 "더하기" 버튼인지 확인하고, 아래 작업을 수행
            // 텍스트 필드에서 입력값을 읽어와 정수로 변환
            int num1 = Integer.parseInt(cv.tf_num1.getText());
            int num2 = Integer.parseInt(cv.tf_num2.getText());

            // 모델 객체를 생성하고 더하기 연산 수행
            CalcModel calc = new CalcModel();
            int result = calc.plus(num1, num2);

            cv.la_result.setText("결과는" + result + "입니다");
        }
    }

    public static void main(String[] args) {
        new CalcController();
    }
}