package list.test.ex1;

//요구사항1: ArrayEx1은 배열을 사용한다. 이 코드를 배열 대신에 리스트를 사용하도록 변경하자.
//요구사항2: 리스트를 사용하는 ListEx1을 만들어라.
public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        double average = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
