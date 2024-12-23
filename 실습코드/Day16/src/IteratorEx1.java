import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator(); // list.iterator()를 호출하여 Iterator 객체 it를 생성
        // Iterator는 직접적으로 객체를 생성하는 것이 아니라, 컬렉션 객체에서 iterator() 메서드를 호출하여 생성

        while(it.hasNext()) { // hasNext()는 다음 요소가 있는지 확인하는 메서드
            Object obj = it.next(); // next()는 현재 요소를 반환하고, 다음 요소로 이동
            System.out.println(obj);
        }
    }
}
