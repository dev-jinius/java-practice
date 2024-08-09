package list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//요구사항
    // 사용자에게 n개의 정수를 입력받아서 List에 저장하고 입력 순서대로 출력하자.
    // 0 을 입력하면 입력을 종료하고 결과를 출력한다.
    // 출력 시 출력 포맷은 1, 2, 3, 4, 5와 같이 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
public class ListEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;
            list.add(num);
        }

        for (Integer i : list) {
            System.out.print(i);
            if (i != list.get(list.size()-1)) System.out.print(", ");
        }
    }
}
