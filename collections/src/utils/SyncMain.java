package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {
        //멀티 스레드 환경에서 동시에 접근하면 문제가 생길 수 있다.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list.getClass() = " + list.getClass());

        //해결
        //멀티 스레드 환경에서 동기화 문제가 발생하지 않는 안전한 리스트   //동기화 작업으로 성능이 일반 리스트보다 느림.
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("list.getClass() = " + synchronizedList.getClass());
    }
}
