package link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        //마지막에 추가 //O(N)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("첫번째 항목에 추가");   // O(1)
        list.add(0, "d");
        System.out.println(list);

        System.out.println("첫번째 항목 삭제");   // O(1)
        list.remove(0);
        System.out.println(list);

        System.out.println("중간에 항목 추가");   //O(N)
        list.add(1, "e");
        System.out.println(list);

        System.out.println("중간에 항목 삭제");   //O(N)
        list.remove(1);
        System.out.println(list);
    }
}
