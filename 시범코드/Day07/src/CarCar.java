public class CarCar {
    String color;  // 색상
    int speed;     // 속도

    // 기본 생성자: 색상과 속도를 기본값으로 설정
    public CarCar() {
        this.color = "검정";  // 기본 색상
        this.speed = 0;       // 기본 속도
    }

    // 매개변수를 받는 생성자: 색상만 설정
    public CarCar(String color) {
        this.color = color;   // 주어진 색상으로 설정
        this.speed = 0;       // 기본 속도
    }

    // 매개변수를 받는 생성자: 색상과 속도 모두 설정
    public CarCar(String color, int speed) {
        this.color = color;   // 주어진 색상으로 설정
        this.speed = speed;   // 주어진 속도로 설정
    }

    // 자동차 정보를 출력하는 메서드
    public void displayInfo() {
        System.out.println("자동차 색상: " + color);
        System.out.println("자동차 속도: " + speed);
    }

    public static void main(String[] args) {
        CarCar car1 = new CarCar();
        // 기본 생성자 호출
        car1.displayInfo();
        // 색상: 검정, 속도: 0

        CarCar car2 = new CarCar("파랑");
        // 색상만 설정하는 생성자 호출
        car2.displayInfo();
        // 색상: 파랑, 속도: 0

        CarCar car3 = new CarCar("빨강", 100);
        // 색상과 속도를 모두 설정하는 생성자 호출
        car3.displayInfo();
        // 색상: 빨강, 속도: 100
    }
}