package set;

import set.member.Member;
import set.member.Member2;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        System.out.println("obj1 = " + obj1);   // 16진수

        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        //비교
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");
        Member2 memberA = new Member2("idA");
        Member2 memberB = new Member2("idA");

        //equals, hashCode를 오버라이딩 한 경우
        System.out.println("(member1 == member2) = " + (member1 == member2));
        System.out.println("(member1 equals member2) = " + (member1.equals(member2)));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());

        //equals, hashCode를 오버라이딩 하지 않은 경우
        //Object가 기본적으로 제공하는 hashCode() 메서드를 사용한다.
            //Object의 hashCode()는 객체의 참조값을 해시 코드로 사용한다.
            //인스턴스마다 서로 다른 값을 반환한다.
        System.out.println("(memberA == memberB) = " + (memberA == memberB));
        System.out.println("(memberA equals memberB) = " + (memberA.equals(memberB)));
        System.out.println("memberA.hashCode() = " + memberA.hashCode());
        System.out.println("memberB.hashCode() = " + memberB.hashCode());
    }
}
