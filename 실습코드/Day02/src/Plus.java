public class Plus {
    public static void main(String[] args) {
        int score = 100;

        int result = 100 + score++;
        System.out.println(result); // 200
        System.out.println(score); // 101

        int result2 = 100 + ++score;
        System.out.println(result2); // 202
        System.out.println(score); // 102
    }
}
