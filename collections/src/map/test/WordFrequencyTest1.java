package map.test;

import java.util.HashMap;
import java.util.Map;

//각각의 단어가 나타난 수를 출력해라.
//실행결과 {orange=1, banana=2, apple=3}
public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        // 코드 작성
        String[] arr = text.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) +1);
//            if (map.containsKey(str)) {
//                map.put(str, map.get(str)+1);
//                continue;
//            }
//            map.put(str, 1);
        }

        System.out.println(map);
    }
}
