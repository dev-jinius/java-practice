package deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

//스택에 push()를 통해서 다음 데이터를 순서대로 입력해라.
    //"youtube.com"
    //"google.com"
    //"facebook.com"
//스택에 pop()을 통해서 데이터를 꺼내고, 꺼낸 순서대로 출력해라.
    //"facebook.com"
    //"google.com"
    //"youtube.com"
//입력 순서와 반대로 출력되는 것을 확인할 수 있다. 가장 마지막에 입력한 데이터가 가장 먼저 출력된다.
public class SimpleHistoryTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        //코드 작성
        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("facebook.com");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
