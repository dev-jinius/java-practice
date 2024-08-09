package set;

import java.util.Arrays;

//배열과 for문 사용해서 데이터 검색
public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("Arrays.toString(inputArray) = " + Arrays.toString(inputArray));

        // O(N) // 데이터 찾기
        int searchValue = 8;
        for (Integer inputValue : inputArray) {
            if (inputValue == searchValue) {
                System.out.println(inputValue);
            }
        }
    }
}
