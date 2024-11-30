public class GetSet {
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("유효하지 않은 나이입니다.");
        }
    }

    // 사람의 정보를 조회하는 메서드
    public String getInfo() {
        return "이름 :" + name + " 나이: " + age;
    }

    public static void main(String[] args) {
        GetSet  person = new GetSet ();

        person.setName("Alice");
        person.setAge(25);

        System.out.println(person.getInfo());
    }
}
