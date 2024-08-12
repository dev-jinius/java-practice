package map;

import java.util.HashMap;

public class MapMain2 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println("studentMap = " + studentMap);

        studentMap.put("studentA", 100);
        System.out.println("studentMap = " + studentMap);

        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        studentMap.remove("studentA");
        System.out.println("studentMap = " + studentMap);
    }
}
