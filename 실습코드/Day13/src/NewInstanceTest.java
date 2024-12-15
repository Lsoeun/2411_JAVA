public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        Person person1 = new Person();
        System.out.println(person1);

        Class pClass = Class.forName("Person");
        Person person2 = (Person)pClass.newInstance();
        System.out.println(person2);

        // ClassNotFoundException: 클래스가 존재하지 않거나, 클래스 경로가 잘못 지정된 경우 발생하는 예외입니다.
        // InstantiationException: 추상 클래스나 인터페이스처럼 인스턴스를 생성할 수 없는 클래스를 인스턴스화하려 할 때 발생하는 예외입니다.
        // IllegalAccessException: 클래스나 생성자에 대한 접근 권한이 부족할 때 발생하는 예외입니다.
    }
}
