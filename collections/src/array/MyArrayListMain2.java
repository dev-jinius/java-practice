package array;

//데이터가 범위를 초과해서 추가되어도, 동적으로 배열 크기를 늘려서 예외가 발생하지 않도록 수정해보자.
/*
    1. 데이터가 배열 최대 크기를 초과해서 추가됨.
    2. 기존 배열보다 큰 배열을 새로 생성한다. 새로운 배열에 기존 배열의 값을 복사한다.
    3. 참조값을 변경한다. (바꿔치기)
    4. 새로운 배열에 데이터를 추가한다.
    5. 기존 배열은 GC의 대상이 된다.
 */
public class MyArrayListMain2 {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2(2);
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);   //ArrayIndexOutOfBoundsException 해결.
    }
}
