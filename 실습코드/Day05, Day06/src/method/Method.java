package method;

public class Method {
    public int sum(int a, int b) {
        int result = a + b + 2; // 여기에 +2만 추가하면 되므로!
        return result;
    }

    public static void main(String[] args) {
        Method method = new Method();
        System.out.println(method.sum(5, 10));
        System.out.println(method.sum(3, 4));
        System.out.println(method.sum(11, 7));
        System.out.println(method.sum(8, 14));
    }
}