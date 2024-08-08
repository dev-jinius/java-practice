package list;

public class BatchProcessor {
    //구체적인 클래스에 의존하는 상태
    //private final MyLinkedList<Integer> list = new MyLinkedList<>();

    //추상화를 통해 강결합을 줄이자!
    //생성자 주입을 통해 외부에서 주입받도록(DI) 해서 MyList 인터페이스에 의존하는 상태
    private final MyList<Integer> list;
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime-startTime) + "ms");
    }
}
