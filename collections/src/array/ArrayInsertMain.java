package array;

import java.util.Arrays;

/**
 [배열에 데이터 추가에 따른 성능 차이]
    1. 첫번째 위치에 데이터 추가
     - O(1): 첫번째 위치 조회
     - O(n): 모든 데이터를 배열 크기 n만큼 오른쪽으로 한 칸씩 이동
     - O(1+n) => O(n): 첫번째 위치에 데이터 추가

    2. 중간 위치에 데이터 추가
     - O(1): 중간 위치 조회
     - O(n/2): index의 오른쪽에 있는 데이터를 모두 오른쪽으로 한 칸씩 이동하는데 평균 연산.
     - O(1+n/2) => O(n): 중간 위치에 데이터 추가

    3. 배열 마지막 위치에 데이터 추가
     - O(1): 기존 배열 데이터 복사 필요 없이 바로 인덱스에 접근해서 데이터를 추가한다.

 [배열의 한계]
    - 장점: 인덱스를 사용할 때 최고의 효율을 갖는다.
    - 한계: 배열의 크기를 배열을 생성하는 시점에 미리 정해야 한다는 것.
    - 동적으로 길이를 늘리고 줄일 수 없다.
*/
public class ArrayInsertMain {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        //1. 배열의 첫번째 위치에 데이터 추가
        // - 기존 배열의 데이터를 한칸씩 오른쪽으로 이동 + 첫번째 위치에 새로운 데이터 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        //2. index 위치(중간 위치)에 데이터 추가
        // - 기본 배열의 index 위치 이후 데이터를 한칸씩 오른쪽으로 이동 + index 위치에 새로운 데이터 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));


        //3. 마지막 위치에 데이터 추가
        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }


    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = newValue;
    }

    private static void addAtIndex(int[] arr, int index, int newValue) {
        for (int i = arr.length-1; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = newValue;
    }

    private static void addLast(int[] arr, int newValue) {
        arr[arr.length-1] = newValue;
    }
}
