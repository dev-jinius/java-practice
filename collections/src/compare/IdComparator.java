package compare;

import java.util.Comparator;

public class IdComparator implements Comparator<MyUser> {
    @Override
    public int compare(MyUser o1, MyUser o2) {
        //문자열 비교를 하기 어렵기 때문에 java에서 compareTo() 메서드로 구현해둔 것을 사용한다.
        return o1.getId().compareTo(o2.getId());
    }
}
