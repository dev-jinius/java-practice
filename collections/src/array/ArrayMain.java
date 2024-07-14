package array;

import java.util.Arrays;

/**
 * 배열의 특징
 * 1. 배열은 메모리상에 순서대로 붙어서 저장된다.
 * 2. 배열의 시작 위치(주소값) + (인덱스 번호 x 자료형 크기) 로 원하는 인덱스의 메모리 위치를 찾을 수 있기 때문에 한번에 검색할 수 있다.
 *      - int[] arr 주소 : x100
 *      - arr[0]: x100 + (4byte * 0) = x100
 *      - arr[2]: x100 + (4byte * 2) = x108
 * 3. 단 한번의 연산으로 많은 데이터에서 원하는 데이터를 빠르고 쉽게 찾을 수 있다.
 * 4. 배열 순차 검색(배열에 들어있는 데이터를 검색하는 것)은 최악의 경우 배열 크기 n만큼 연산도 n번 필요하다.
 */
public class ArrayMain {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("==index 입력: O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 변경: O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 조회: O(1)==");
        System.out.println("arr[2] " + arr[2]);

        System.out.println("==배열 검색: O(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
    }
}
