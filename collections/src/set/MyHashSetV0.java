package set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elementData = new int[10];
    private int size = 0;

    //O(N)
    public boolean add(int value) {
        //중복 데이터를 찾는데 O(N)으로 성능이 떨어지는 요소.
        if (contains(value))
            return false;

        elementData[size] = value;
        size++;
        return true;
    }

    //O(N)
    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
