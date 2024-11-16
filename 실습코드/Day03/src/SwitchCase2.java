// break문이 없는 경우
public class SwitchCase2 {
    public static void main(String[] args) {
        int ranking = 1;
        char medalColor;

        switch(ranking) {
            case 1: medalColor = 'G';
            case 2: medalColor = 'S';
            case 3: medalColor = 'B';
            default :
                medalColor = 'A';
        }

        System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
    }
}
