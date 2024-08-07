package link;

public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==기능 사용==");
        //인텔리제이 단축키 : list.size().soutv => 아래처럼 자동으로 출력 구문 만들어줌.
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2, 'z') = " + list.set(2, "z"));
        System.out.println(list);

        System.out.println("==범위 초과==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        
        //범위 초과 에러 발생
        //size가 배열 크기인 capacity에 도달하면 더이상 데이터를 추가할 수 없다 => 추가하면 예외 발생
        list.add("f");
        System.out.println(list);   //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        //데이터가 범위를 초과해서 추가되어도, 동적으로 배열 크기를 늘려서 예외가 발생하지 않도록 수정해보자.
        //김영한님 중급 - 직접 구현하는 배열 리스트2 - 동적배열 부터 시작하면 됨.
    }
}
