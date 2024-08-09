package list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//요구사항
    // 사용자에게 n개의 정수를 입력받아서 List에 보관하고, 보관한 정수의 합계와 평균을 계산하는 프로그램 작성
public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;
            list.add(num);
        }

        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + (double) sum/list.size());
    }
}
