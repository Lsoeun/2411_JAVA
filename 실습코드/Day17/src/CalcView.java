import javax.swing.*;
// Swing은 자바에서 제공하는 GUI (Graphical User Interface) 라이브러리
// javax.swing 패키지는 Swing에서 사용하는 GUI 클래스와 인터페이스를 포함하고 있음

// View
public class CalcView extends JFrame { // 사용자 인터페이스를 구성하는 뷰 클래스
    JTextField tf_num1 = new JTextField(); // 첫 번째 숫자를 입력받는 텍스트 필드
    JTextField tf_num2 = new JTextField(); // 두 번째 숫자를 입력받는 텍스트 필드

    JButton btn_plus = new JButton("더하기"); // "더하기" 연산을 수행하는 버튼

    JLabel la_result = new JLabel("결과 출력"); // 결과를 출력하는 레이블

    CalcView() {  // 생성자: 뷰를 초기화하고 구성요소를 배치
        setSize(300, 200); // 창 크기를 가로 300, 세로 200으로 설정
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을 때 프로그램 종료

        // 각 컴포넌트의 위치와 크기를 설정
        tf_num1.setBounds(50, 50, 40, 40); // 첫 번째 입력 필드 위치
        tf_num2.setBounds(100, 50, 40, 40); // 두 번째 입력 필드 위치
        btn_plus.setBounds(150, 50, 80, 40); // "더하기" 버튼 위치
        la_result.setBounds(50, 100, 200, 40); // 결과 출력 레이블 위치

        // 컴포넌트를 JFrame에 추가
        add(tf_num1);
        add(tf_num2);
        add(btn_plus);
        add(la_result);

        // 창을 화면에 표시
        setVisible(true);
    }
}