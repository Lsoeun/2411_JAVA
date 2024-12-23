import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack(); // Stack은 클래스
        Queue q = new LinkedList(); // Queue는 인터페이스
        // Queue 인터페이스를 구현한 LinkedList를 사용(FIFO 동작을 효율적으로 지원하기 때문)

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");
        while(!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println("= Queue =");
        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}

