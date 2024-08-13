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

### Hash 기반 자료구조에서 주의할 점
- hashCode()와 equals() 메서드의 재정의
  - hashCode()는 해시 기반 자료구조에서 어떤 버킷에 저장할지 결정한다.
  - 동일한 객체는 항상 동일한 해시 코드를 반환해야 한다.
    - 물리적으로 동일한 객체(참조 주소값이 같은 객체)는 재정의 하지 않아도 동일한 객체
    - 논리적으로 동일한 객체(주소는 다르지만/다른 인스턴스지만 같은 객체로 봐야하는 객체)는 자바에서 제공하는 Object의 기본 equals()로 비교 시 다른 객체로 보기 때문에 재정의해서 같은 객체로 간주하도록 변경해야 한다.
  - 만약 hashCode()만 재정의하고, equals()를 재정의하지 않으면 객체를 자료구조에 추가한 이후에 equals()로 객체 비교 시 의도한대로 같은 객체로 검색할 수 없는 상황이 생길 수 있다.

### HashSet
- 해시 자료 구조를 사용해서 요소를 저장한다.
- 순서없이 저장되고, 주요 연산이 평균적으로 O(1) 성능을 가진다.
- 데이터의 중복 제거 시 적합하다.
- 구현체 중 가장 많이 사용한다.

### LinkedHashSet
- HashSet에 연결 리스트를 추가해서 요소들의 순서를 보장한다.
- 시간복잡도는 O(1)을 가진다.
- HashSet 보다는 좀 더 무겁지만, 중복 제거와 함께 순서를 유지해야할 때 적합하다.

### TreeSet
- 이진 탐색 트리를 개선한 레드-블랙 트리를 내부에서 사용한다.
- 요소들은 데이터의 정렬된 순서로 저장된다.
- 주요 연산들은 O(log N)의 시간 복잡도를 가진다.
- 데이터의 중복을 제거하면서 정렬할 때 유리하다.

## Map 인터페이스
### Map 
- Map은 키-값의 쌍을 저장하는 자료구조다.
- 키는 맵 내에서 유일해야 하고, 키를 통해 값을 빠르게 검색할 수 있다.
- 키는 중복될 수 없지만, 값은 중복될 수 있다.
- Map은 순서를 유지하지 않는다.
- Collection 인터페이스와 관계가 없다.
- 구현체 중에 `HashMap`을 가장 많이 쓴다.
- Set과 거의 유사하고, 구현체로 HashMap, LinkedHashMap, TreeMap 등이 있다.

### 키 목록 조회
- Map의 `keySet()` 은 키 목록을 조회하고 Set을 반환한다.
- Map의 키는 순서를 보장하지 않고, 유일한 값만 저장하기 때문에 Java의 Set과 같은 자료구조로 되어있다.
- Java의 HashSet의 구현은 HashMap을 가져와서 value를 비워두고 key만을 사용하도록 되어 있다.
  
### 키와 값 목록 조회
- Map의 `Entry` 는 Map의 키와 값을 하나로 묶어서 저장한다.
- Entry는 키-값의 쌍으로 이뤄진 간단한 객체다.
- 하나의 Map에 여러 Entry가 저장될 수 있다.
- Entry는 Map 내부에 있는 인터페이스이다.

### 값 목록 조회
- Map의 `values()'는 값 목록을 조회하고, Collection을 반환한다.
- Map의 값은 중복을 허용한다. => Set 반환 불가
- Map의 값은 입력 순서를 보장하지 않는다 => List 반환 불가
- 값의 모음이라는 의미의 상위 인터페이스 Collection 반환 가능

## Queue 인터페이스
- Queue 인터페이스는 `List`, `Set` 과 같이 `Collection`의 자식이다.
- 대표적인 구현체는 `ArrayDeque`, `LinkedList`가 있다.
  - LinkedList 는 `Deque` 와 `List` 인터페이스를 모두 구현한다.
    ![image](https://github.com/user-attachments/assets/2c724e2f-5e77-4911-8b76-acc4e7ffc5b3)

## Iterable, Iterator 인터페이스
- 각 자료구조마다 Iterator 구현체는 내부적으로 다 다르다.
- 하지만, Iterable 인터페이스만 사용하면 간단한다. => hasNext(), next()로 모든 요소를 순회할 수 있다.
- 향상된 for문 (foreach문)은 Iterable 인터페이스를 구현한 객체에서 사용할 수 있다.
  - 컴파일 시점에 자바는 향상된 for문을 `iterator의 hasNext()와 next()`를 사용한 코드로 변경하기 때문이다.
- `Iterable` 인터페이스는 Collection 인터페이스의 부모로 Collection은 Iterable과 Iterator를 사용해서 순회할 수 있다.
- Map은 key와 value를 갖는 자료구조이기 때문에 Iterator로 순회할 수는 없다.

## Comparable, Comparator 인터페이스
- 객체의 기본 정렬 방법: `Comparable`을 구현하면 비교할 수 있는 객체가 되고, 기본 정렬을 할 수 있게 된다.
- 객체 비교해서 더 큰 값과 작은 값을 구별할 수 있다.
  - 자기 자신 vs 인수로 넘어온 객체 비교
  - 현재 객체(자기 자신)가 인수로 주어진 객체보다 더 작다 => 음수(-1) 반환
  - 두 객체의 값이 같다 => 0 반환
  - 현재 객체(자기 자신)가 인수로 주어진 객체보다 더 크다 => 양수(1) 반환
- `Comparable`을 통해 구현한 순서를 `자연 순서(Natural Ordering)`이라고 한다.
  - compareTo() 메서드 안에 정한 기준으로 기본 정렬을 구현할 수 있다.
  - 만약 정렬 기준을 추가하고 싶다면? => Comparator를 구현해서 인수로 넘겨주면 Comparator에 구현한 기준으로 정렬 기준이 된다.
- 배열 뿐만 아니라 `List` 같은 순서가 있는 자료구조에도 사용할 수 있다.
- Tree 구조 또한 정렬이 필수인 자료구조로 사용할 수 있다.