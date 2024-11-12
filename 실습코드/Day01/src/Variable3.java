// 변수 특징 알아보기
public class Variable3 {
    public static void main(String[] args) {
//        1. 변수는 선언(정의)되어야만 사용이 가능하다.
        int level;

//        2. 변수를 선언할 때 변수명 앞에 반드시 데이터 타입이 명시되어야 한다.
        String name;
        // number; -> not a statement(변수 선언 오류)

//        3. 변수는 값을 저장할 수 있는 공간이다.
        int id = 1000;

//        4. 변수는 중복해서 정의하는 것이 불가능하다.
        // int level; -> variable id is already defined in method main(java.lang.String[])
        // int id = 2000; -> variable id is already defined in method main(java.lang.String[])
        id = 2000;

//        5. 변수는 재사용이 가능하다.
        int x = 30;
        System.out.println(x);

        x = 10; // 변수 재사용
        System.out.println(x);

        x = x + 50;
        System.out.println(x);

//        6. 변수에는 값을 오직 하나만 저장이 가능하다.
        System.out.println(x);

//        7. 변수는 초기화 하지 않으면 사용이 불가능하다.
        // int ini;
        // System.out.println(ini); -> variable ini might not have been initialized

//        8. 변수명을 다르게 하면 얼마든지 새로운 변수를 선언할 수 있다.
        int a = 10;
        int b = 20;
    }
}
