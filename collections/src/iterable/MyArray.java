package iterable;

import java.util.Iterator;

//Iterable 인터페이스를 상속: 반복가능한 기능을 갖고 있다.
//반복가능하다 => 반복자를 갖고 있다.
public class MyArray implements Iterable<Integer> {
    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
