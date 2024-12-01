public class Person {
    String name;
    int age;

    public Person() {}

    // 생성자를 통한 초기화
    public Person(String name, int age) {
        this.name = name; // 필드 name 초기화
        this.age = age;   // 필드 age 초기화
    }
    public static void main(String[] args) {
        // 매개변수가 있는 생성자가 없는 경우 (비효율적)
        // Person person = new Person();
        // person.name = "홍길동";
        // person.age = 25;

        // 매개변수가 있는 생성자를 사용하는 경우(생성자를 통한 초기화)
        Person person = new Person("홍길동", 25); // 간단하고 직관적
        System.out.println(person.name); // 출력: 홍길동
        System.out.println(person.age);  // 출력: 25
    }
}
