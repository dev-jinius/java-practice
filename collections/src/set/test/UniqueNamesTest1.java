package set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//요구사항
    //여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력하라.
    //출력 순서는 관계 없다.
public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new HashSet<>(List.of(inputArr));
//        Set<Integer> set = new HashSet<>();
//        for (Integer integer : inputArr) {
//            set.add(integer);
//        }

        for (Integer s : set) {
            System.out.println(s);
        }

    }
}
