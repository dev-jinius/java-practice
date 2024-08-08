package link;

//제네릭 도입으로 타입 안정성이 증가한 단일 연결 리스트 자료구조
public class MyLinkedListV3<E> {
    private Node<E> first;     // 첫 노드의 위치를 가리킨다.
    private int size = 0;

    //시간복잡도 O(N)
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    //추가 코드
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    //시간복잡도 O(N)
    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    //추카 코드
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node<E> prev = getNode(index-1);
            prev.next = removeNode.next;
        }

        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    //시간복잡도 O(N)
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    //시간복잡도 O(N)
    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    /*
        [중첩 클래스]
        - 클래스 안에서 클래스를 선언하는 것
        - 특정 클래스 안에서만 사용될 때 주로 사용한다.
        - 특정 클래스 안으로 클래스 선언을 숨길 수 있다.
        - MyLinkedListV3 입장에서 외부의 Node 클래스보다 내부에 선언한 Node 클래스를 먼저 사용하게 된다.
     */
    private static class Node<E> {
        E item;
        Node<E> next;  //참조 주소를 저장할 수 있다.

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while(x != null) {
                sb.append(x.item);
                if (x.next != null)
                    sb.append("->");
                x = x.next;
            }
            sb.append("]");

            return sb.toString();
        }
    }
}
