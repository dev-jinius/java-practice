package array;

//타입 안정성이 높은 자료구조를 만들어보자.
    //제네릭 사용
public class MyArrayListMain4 {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String str = stringList.get(0);
        System.out.println("str = " + str);

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer num = intList.get(0);
        System.out.println("num = " + num);
    }
}
