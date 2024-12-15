public class PersonMain {

    Person person = new Person() { // 인터페이스나 추상클래스형 변수를 선언하고 클래스를 생성해 대입하는 방법
        @Override
        public void eat() {
            System.out.println("eat!");
        }

        @Override
        public void sleep() {
            System.out.println("sleep");
        }
    };
}
