package compare;

import java.util.Arrays;

public class SortMyUserMain {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] array = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("Comparable 기본 정렬"); // MyUser의 compareTo() 메서드에 나이 기준으로 구현했다.
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //만약 기본 정렬 외에 다른 기준으로 정렬하고 싶다면?
        System.out.println("IdComparator 정렬");
        Arrays.sort(array, new IdComparator());
        System.out.println(Arrays.toString(array));
        System.out.println("IdComparator().reversed() 정렬");
        Arrays.sort(array, new IdComparator().reversed());  //IdComparator 정렬 기준의 리버스
        System.out.println(Arrays.toString(array));

    }
}
