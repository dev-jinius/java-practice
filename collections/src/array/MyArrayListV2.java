package array;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        //코드 추가
        if (size == elementData.length) {
            grow();
        }

        elementData[size] = e;
        size++;
    }

    //코드 추가
    private void grow() {

        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

//        //1. 기존보다 2배 더 큰 배열을 만들기
//        Object[] newArr = new Object[newCapacity];
//
//        //2. 새로 만든 배열에 기존 데이터 복사
//        for (int i = 0; i < elementData.length; i++) {
//            newArr[i] = elementData[i];
//        }
        //1~2. 2배 큰 배열을 만들고, 기존 데이터를 복사한다.
        Object[] newArr = Arrays.copyOf(elementData, newCapacity);

        //3. 기존 배열을 새로 만든 배열로 바꿔치기
        elementData = newArr;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        //Arrays.copyOf(elementData, size): size 크기의 배열을 새로 만든다.
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + " size = " + size + ", capacity = " + elementData.length;
    }
}
