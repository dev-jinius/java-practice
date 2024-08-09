package list.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> students = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            students.add(100-(i+1)*10);
        }

        int total = 0;
        for (int i = 0; i < students.size(); i++) {
            total += students.get(i);
        }
        double average = (double) total / students.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
