## Stack 
- Stack 클래스는 내부에서 `Vector` 라는 자료구조를 상속받아서(extends) 사용한다.
- Vector : 자바 1.0에 개발되었는데, 지금은 사용되지 않고, 하위 호환을 위해 존재한다.
- Deque를 사용하는 것이 권장된다.

## Deque
- `Deque` 는 "Double Ended Queue"의 약자로 `데크`,`덱` 등 으로 부른다.
- Deque는 양쪽 끝에서 요소를 추가하거나 제거할 수 있다.
- Deque는 일반적인 `Queue`와 `Stack`의 기능을 모두 포함하고 있어 유연한 자료구조이다.
  - `offerFirst()`: 앞에 추가
  - `offerLast()`: 뒤에 추가
  - `pollFirst()`: 앞에서 꺼내기
  - `pollLast()`: 뒤에서 꺼내기

### ArrayDeque 와 LinkedList
- 두 개 모두 O(1)이지만, 모든 면에서 `ArrayDeque` 가 더 빠르다.
- 시스템의 메모리 접근 패턴, CPU 캐시 최적화 등을 고려할 때 배열을 사용하는 ArrayQueue가 더 성능이 좋다.
- ArrayQueue는 배열 중에 원형 큐 자료 구조를 사용한다.
- LinkedList는 동적 노드 링크를 사용한다.

### Deque의 Stack과 Queue
- Java의 Stack 클래스는 성능이 좋지 않다.
- Deque에서는 `Stack`을 위한 메서드를 제공하기 때문에 `ArrayDeque`를 사용해서 Stack으로 활용하는 것이 좋다.
- Deque 인터페이스는 Queue 인터페이스의 자식이기 때문에, 단순히 Queue 기능만 사용한다면 Queue 인터페이스를 사용한다.
- 더 많은 기능을 사용하기 위해서는 Deque를 Queue로 사용할 수 있다.