public class A {
    String name;

    public static void main(String[] args) {
        A a = new A(); // 객체 생성
        A c = new A(); // 객체 생성
        System.out.println(a); // 주소값 : A@4eec7777
        System.out.println(c); // 주소값 : A@3b07d329

        a.name = "A";
        System.out.println(a.name); // 출력: "A"
        System.out.println(c.name); // 출력: "null"

        A b = a;       // a와 b가 같은 객체를 참조하도록 함

        a.name = "이이름"; // a의 name을 "이이름"으로 변경
        System.out.println(a.name); // 출력: "이이름"
        System.out.println(b.name); // 출력: "이이름"

        b.name = "김이름"; // b의 name을 "김이름"으로 변경
        System.out.println(a.name); // 출력: "김이름"
        System.out.println(b.name); // 출력: "김이름"
    }
}