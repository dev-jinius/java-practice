package set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1); //0(1)
        set.add(2); //0(N)
        set.add(3); //0(N)
        set.add(4); //0(N)
        set.add(5); //0(N)
        System.out.println(set);

        set.add(4); //중복 데이터 저장
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contains(3));
        System.out.println("set.contains(99) = " + set.contains(99));
    }
}
