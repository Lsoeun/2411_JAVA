import java.util.*;

// ArrayList: 내부적으로 배열을 사용하여 데이터를 저장. 순차적으로 추가/삭제할 때 빠르지만, 중간에 데이터를 삽입하거나 삭제하는 경우 성능이 느려질 수 있음.
// LinkedList: 연결 리스트 구조를 사용하여 데이터를 저장. 중간 데이터 추가/삭제에 유리하지만, 순차 접근 속도는 느림.

public class ListTest {
    public static void main(String[] args) {
        // 추가할 데이터의 개수를 고려햐여 충분히 잡아야한다.
        // 데이터를 추가하면서 배열의 크기가 초과되면, 배열을 더 큰 크기로 재할당하고 기존 데이터를 복사하는 작업이 성능에 영향을 줄 수 있기 때문!
        ArrayList al = new ArrayList(2000000);
        // 내부적으로 배열을 사용하기 때문에 초기 용량 설정(안하면 기본 크기로 설정되기 때문)
        LinkedList ll = new LinkedList(); // 초기 용량을 설정할 필요 없음

        System.out.println("= 순차적으로 추가하기 =");
        // 리스트에 데이터를 순차적으로 추가하는 속도를 비교
        System.out.println("ArrayList : " + add1(al));
        System.out.println("LinkedList : " + add1(ll));
        System.out.println();

        System.out.println("= 중간에 추가하기 =");
        // 리스트의 중간에 데이터를 추가하는 속도를 비교
        System.out.println("ArrayList : " + add2(al));
        System.out.println("LinkedList : " + add2(ll));
        System.out.println();

        System.out.println("= 중간에서 삭제하기 =");
        // 리스트의 중간에서 데이터를 삭제하는 속도를 비교
        System.out.println("ArrayList : " + remove2(al));
        System.out.println("LinkedList : " +remove2(ll));
        System.out.println();

        System.out.println("= 순차적으로 삭제하기 =");
        // 리스트의 데이터를 순차적으로 삭제하는 속도를 비교
        System.out.println("ArrayList : " + remove1(al));
        System.out.println("LinkedList : " + remove1(ll));
        System.out.println();
    }

    // 순차적으로 데이터를 추가하는 메서드
    public static long add1(List list) {
        long start = System.currentTimeMillis(); // 시작 시간 기록

        for(int i = 0; i < 1000000; i++) {  // 1,000,000개의 데이터를 순차적으로 추가
            list.add(i + "");
        }

        long end = System.currentTimeMillis(); // 끝난 시간 기록
        return end - start; // 작업에 걸린 시간(밀리초) 반환
    }

    // 리스트의 중간에 데이터를 추가하는 메서드
    public static long add2(List list) {
        long start = System.currentTimeMillis();  // 시작 시간 기록

        // 리스트의 500번 인덱스에 데이터를 10,000번 추가
        for(int i = 0; i < 10000; i++) {
            list.add(500, "X"); // 중간에 삽입
        }

        long end = System.currentTimeMillis(); // 끝난 시간 기록
        return end - start; // 작업에 걸린 시간 반환
    }

    // 순차적으로 데이터를 삭제하는 메서드
    public static long remove1(List list) {
        long start = System.currentTimeMillis();

        for(int i = list.size() - 1; i >= 0; i--) {
            list.remove(i); // 맨 끝에서부터 삭제
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    // 리스트의 중간에서 데이터를 삭제하는 메서드
    public static long remove2(List list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) { // 중간 데이터를 10,000번 삭제
            list.remove(i); // 중간에서 삭제
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
}