package set;

import java.util.Arrays;

//배열과 인덱스를 활용해 검색을 더 빠르게 만들었다.
//입력 값을 배열의 인덱스와 동일한 곳에 저장한다.
    // 배열이 비어있지만, 입력 값이 1이라면, 배열의 0번 인덱스가 아니라 1번 인덱스에 값을 저장한다.
    // 즉, 데이터 값을 인덱스로 사용한다.
//배열에 낭비되는 공간이 생긴다.
public class HashStart2 {
    public static void main(String[] args) {
        //입력: 1, 2, 5, 8
        //[null, 1, 2, null, null, 5, null, null, 8, null]
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("Arrays.toString(inputArray) = " + Arrays.toString(inputArray));

        // O(1) // 데이터 찾기 (데이터를 인덱스로 활용한다)
        int searchValue = 8;
        System.out.println("inputArray[searchValue] = " + inputArray[searchValue]);
    }
}
