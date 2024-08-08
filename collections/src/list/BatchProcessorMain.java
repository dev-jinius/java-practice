package list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>();      //10만건 - 8282ms (약 8초)
        MyLinkedList<Integer> list = new MyLinkedList<>();      //10만건 - 5ms (0.005초)

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(100_000);   // 앞에 데이터 추가하는 기능

    }
}
