public class Car {
    // 자동차의 속성을 나타내는 멤버 변수
    String color;  // 색상
    int speed;     // 속도

    // 생성자: 자동차를 만들 때 색상과 속도를 정해줌
    public Car(String carColor, int carSpeed) {
        this.color = carColor;  // 주어진 색상으로 색상을 설정
        this.speed = carSpeed;  // 주어진 속도로 속도를 설정
    }

    // 자동차 정보를 보여주는 메서드
    public void displayInfo() {
        System.out.println("자동차 색상: " + color);
        System.out.println("자동차 속도: " + speed);
    }
}
