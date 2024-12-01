package inheritance;

public class Car extends Vehicle{

    public Car() {
        super(); // 우리가 명시하지 않으면 자바 컴파일러가 자동으로 호출해줌
        System.out.println("car 생성자 호출");
    }

    public static void main(String[] args) {
        Car car = new Car();
    }
}
