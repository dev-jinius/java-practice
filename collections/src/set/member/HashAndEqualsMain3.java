package set.member;

import set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        //논리적으로 m1 회원과 m2 회원은 같은 회원이다.
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");

        //m1, m2의 원래 참조값
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));

        //재정의 된 해시 코드
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        //중복 등록이 된다. (equals 때문에)
        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 실패 (equals 때문에)
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
