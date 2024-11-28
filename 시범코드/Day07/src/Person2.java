public class Person2 {
    String name;
    float height;
    float weight;

    /**
     * 사람 이름을 매개변수로 입력받아서
     * Person 클래스를 생성하는 생성자
     */
    public Person2(String pname) {
        name = pname;
    }

    // public Person2() {} // 디폴트 생성자 직접 추가

    public static void main(String[] args) {
        // Person2 personLee = new Person2(); // 오류 발생
        Person2 personLee = new Person2("이이름");
        System.out.println(personLee.name);
    }
}
