package set;

import java.util.Arrays;

//입력 값(데이터)를 인덱스로 사용하는 것은 입력 값의 범위가 넓을수록 메모리 낭비가 심해진다.
public class HashStart3 {
    public static void main(String[] args) {
        //입력: {1, 2, 5, 8, 14, 99}
        //[null, 1, 2, null, null, 5, null, null, 8, null, ..., 14, ..., 99]
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("Arrays.toString(inputArray) = " + Arrays.toString(inputArray));

        // O(1) // 데이터 찾기 (데이터를 인덱스로 활용한다)
        int searchValue = 99;
        System.out.println("inputArray[searchValue] = " + inputArray[searchValue]);
    }
}
