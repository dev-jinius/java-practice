package array;

public class MyArrayListMain3 {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        System.out.println("==데이터 마지막에 추가==");  //O(1)
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(3, "addList");
        System.out.println(list);

        System.out.println("==데이터 맨앞에 추가==");   //O(n)
        list.add(0, "addFirst");
        System.out.println(list);

        System.out.println("==마지막 데이터 삭제==");  //O(1)
        Object removed1 = list.remove(4);
        System.out.println("removed1 = " + removed1);
        System.out.println(list);

        System.out.println("==맨 앞 데이터 삭제=="); // O(n)
        Object removed2 = list.remove(0);
        System.out.println("removed2 = " + removed2);
        System.out.println(list);
    }
}
