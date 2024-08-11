package set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//요구사항
    //여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력하라.
    //단, 입력 순서대로 출력하라.
public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));
//        Set<Integer> set = new LinkedHashSet<>();
//        for (Integer integer : inputArr) {
//            set.add(integer);
//        }

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
