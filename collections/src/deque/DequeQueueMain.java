package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();  // Queue처럼 사용할 Deque

        //데이터 추가
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

        System.out.println("deque.peek() = " + deque.peek());

        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println(deque);
    }
}
