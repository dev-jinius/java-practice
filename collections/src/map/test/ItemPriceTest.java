package map.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Map에 들어있는 데이터 중에 값이 1000원인 모든 상품을 출력해라.
//실행 결과 [망고, 딸기]
public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        Set<String> set = new HashSet<>();
        // 코드 작성
        for (String key : map.keySet()) {
            if (map.get(key) == 1000)
                set.add(key);
        }

        System.out.println(set);
    }
}
