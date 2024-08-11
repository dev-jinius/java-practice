package set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//요구사항
    //여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력하라.
    //단, 데이터를 정렬해서 출력하라.
public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(List.of(30, 20, 20, 10, 10));
//        Integer[] inputArr = {30, 20, 20, 10, 10};
//        Set<Integer> set = new LinkedHashSet<>();
//        for (Integer integer : inputArr) {
//            set.add(integer);
//        }

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
