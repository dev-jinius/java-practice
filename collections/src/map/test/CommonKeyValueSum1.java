package map.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// map1과 map2에 공통으로 들어있는 키를 찾고, 그 값의 합을 구해라.
// 실행 결과 : {B=6, C=8}
public class CommonKeyValueSum1 {
    public static void main(String[] args) {

        //Map.of()로 쉽게 만들 수 있지만 만들어진 Map은 변경할 수 없다.
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);
//        Map<String, Integer> map1 = new HashMap<>();
//        map1.put("A", 1);
//        map1.put("B", 2);
//        map1.put("C", 3);
//        Map<String, Integer> map2 = new HashMap<>();
//        map2.put("B", 4);
//        map2.put("C", 5);
//        map2.put("D", 6);

        // 코드 작성
        Map<String, Integer> resultMap = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key))
                resultMap.put(key, map1.get(key)+map2.get(key));
        }

        System.out.println(resultMap);
    }
}
