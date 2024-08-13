package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        //불변 리스트
        List<Integer> list = List.of(1, 2, 3);
        //list.add(4);  //Exception

        //불변 리스트 -> 가변 리스트로 변환
        List<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);

        //가변 리스트 -> 불변 리스트로 변환
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        //unmodifiableList.add(5);    //Exception
        System.out.println("unmodifiableList.getClass() = " + unmodifiableList.getClass()); // class java.util.Collections$UnmodifiableRandomAccessList
    }
}
