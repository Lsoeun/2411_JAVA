public class A {
    String name;

    public static void main(String[] args) {
        A a = new A(); // 객체 생성
        A b = a;       // a와 b가 같은 객체를 참조

        a.name = "이이름"; // a의 name을 "이이름"으로 변경
        System.out.println(b.name); // 출력: "이이름"

        b.name = "김이름"; // b의 name을 "김이름"으로 변경
        System.out.println(a.name);
    }
}