# Java의 Collection Framework
## Collection 인터페이스
- `java.util` 패키지의 컬렉션 프레임워크의 핵심 인터페이스 중 하나.
- Collection 인터페이스는 List, Set, Queue 와 같은 다양한 하위 인터페이스와 함께 사용된다.

## List 인터페이스
- `java.util` 패키지에 있는 컬렉션 프레임워크의 일부다.
- List는 객체들의 순서가 있는 컬렉션을 나타낸다. 
- List는 같은 객체의 중복 저장을 허용한다.
- List는 동적으로 변화하는 컬렉션을 다룰 때 유연하게 사용할 수 있다.
- List 인터페이스는 ArrayList, LinkedList와 같은 여러 구현 클래스를 갖고 있다.

### Java의 ArrayList
- `java.util.ArrayList`
- 배열을 사용해서 데이터를 관리한다.
- 기본 CAPACITY는 10이다. (DEFAULT_CAPACITY = 10);
  ![image](https://github.com/user-attachments/assets/4a9d0bb4-6fe9-41de-a91b-c01f8eb7774d)
- CAPACITY를 넘어가면 현재 크기의 50% 길이만큼 증가시킨다. (oldCapacity >> 1)
  ![image](https://github.com/user-attachments/assets/1fe59ed5-8b47-44d8-8398-a888420de8b4)
- 메모리 고속 복사 연산을 사용한다. (System.arraycopy())
  - 배열의 요소 이동을 시스템 레벨에서 최적화한다.
  - 요소 한개씩 복사하는 것과 달리 이동할 요소의 범위 통째로 복사하는 것을 말한다.
    ![image](https://github.com/user-attachments/assets/5b763d42-3ab1-408f-ac3f-0ee3b393bcb2)

  
### Java의 LinkedList
- `java.util.LinkedList`
- 이중 연결 리스트 구조로 첫 번째 노드와 마지막 노드 모두 참조한다.
  - node.next는 다음 노드를, node.prev는 이전 노드를 의미.
  - 데이터를 맨앞, 맨뒤에 추가하는 경우 모두 O(1)의 성능을 가진다.
- 인덱스 조회 성능 최적화를 할 수 있다.
  - 인덱스가 size/2 이하라면, 맨앞에서부터 찾고, size/2보다 크다면 역방향으로 조회한다.

### Java의 List 성능 비교 
- 데이터 50000건 기준
- 윈도우 OS로 테스트
- 데이터를 중간에 추가할 때 ArrayList가 LinkedList보다 빠른 이유는 메모리 고속 복사를 사용해 최적화하기 때문이다. 

| Function    | ArrayList       | LinkedList      |
|:------------|:----------------|:----------------|
| 맨앞 추가/삭제 | O(N) [94ms]     | O(1) [7ms]      |
| 평균 추가/삭제 | O(N) [48ms]     | O(N) [1161ms]   |
| 맨뒤 추가/삭제 | O(1) [6ms]      | O(1) [3ms]      |
| 인덱스 조회    | O(1) [1ms]      | O(N) [378ms]    |
| 검색          | O(N) [평균 220ms] | O(N) [평균 571ms] |

### 실무에서 List
- 대부분의 경우 ArrayList가 성능상 유리하기 때문에 주로 ArrayList를 사용한다.
- 만약 데이터를 맨앞에 자주 추가하거나 삭제해야 한다면 LinkedList를 고려한다.

## Set 인터페이스
- `java.util` 패키지의 컬렉션 프레임워크에 속하는 인터페이스 중 하나.
- 중복을 허용하지 않는 유일한 요소의 집합을 나타낸다.
- 순서를 보장하지 않는다.
- 특정 요소가 집합에 있는지 여부를 확인하는 데 최적화되어 있다.
- 구현체로 HashSet, LinkedHashSet, TreeSet 등이 있다.

### HashSet
- 해시 자료 구조를 사용해서 요소를 저장한다.
- 순서없이 저장되고, 주요 연산이 평균적으로 O(1) 성능을 가진다.
- 데이터의 중복 제거 시 적합하다.

### LinkedHashSet
- HashSet에 연결 리스트를 추가해서 요소들의 순서를 보장한다.
- 시간복잡도는 O(1)을 가진다.
- HashSet 보다는 좀 더 무겁지만, 중복 제거와 함께 순서를 유지해야할 때 적합하다.

### TreeSet
- 이진 탐색 트리를 개선한 레드-블랙 트리를 내부에서 사용한다.
- 요소들은 데이터의 정렬된 순서로 저장된다.
- 주요 연산들은 O(log N)의 시간 복잡도를 가진다.
- 데이터의 중복을 제거하면서 정렬할 때 유리하다.

