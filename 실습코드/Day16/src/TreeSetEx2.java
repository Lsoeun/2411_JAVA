import java.util.*;

public class TreeSetEx2 {
    public static void main(String[] args) {
        // TreeSet 객체 생성 (정렬된 순서로 데이터를 저장하는 Set)
        TreeSet set = new TreeSet();
        // 정수 배열 선언
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for(int i = 0; i < score.length; i++) {
            // 각 배열 요소를 Integer 객체로 래핑하여 TreeSet에 추가
            set.add(Integer.valueOf(score[i]));
        }

        // headSet(Integer.valueOf(50))는 50보다 작은 값들만 포함하는 서브셋을 반환
        System.out.println("50보다 작은 값 : " + set.headSet(Integer.valueOf(50)));
        // tailSet(Integer.valueOf(50))는 50보다 크거나 같은 값들만 포함하는 서브셋을 반환
        System.out.println("50보다 큰 값 : " + set.tailSet(Integer.valueOf(50)));

//        headSet()은 주어진 값보다 작은 값들을 반환
//        tailSet()은 주어진 값보다 크거나 같은 값들을 반환
    }
}