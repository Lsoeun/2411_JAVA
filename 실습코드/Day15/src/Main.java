public class Main {
    public static void main(String[] args) {
        // Integer 타입을 사용하는 GenericPrinter
        GenericPrinter<Integer> intPrinter = new GenericPrinter<>();
        intPrinter.setMaterial(123); // 정수 값을 설정
        System.out.println("Integer: " + intPrinter.getMaterial()); // 123 출력

        // String 타입을 사용하는 GenericPrinter
        GenericPrinter<String> stringPrinter = new GenericPrinter<>();
        stringPrinter.setMaterial("Hello, Generics!"); // 문자열을 설정
        System.out.println("String: " + stringPrinter.getMaterial()); // "Hello, Generics!" 출력

        // Double 타입을 사용하는 GenericPrinter
        GenericPrinter<Double> doublePrinter = new GenericPrinter<>();
        doublePrinter.setMaterial(45.67); // 실수를 설정
        System.out.println("Double: " + doublePrinter.getMaterial()); // 45.67 출력
    }
}
