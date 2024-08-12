## Java HashMap 작동원리
- Java의 HashMap은 HashSet과 작동 원리가 같다.
- Map이 Set과 비교해서 다른 점
  - `Key` 를 사용해서 `해시 코드`를 생성한다.
  - Key 뿐만 아니라 Value를 추가로 저장해야 하기 때문에 `Entry`를 사용해서 Key,Value를 묶어서 하나로 저장한다.
  - `해시 테이블` : 해시를 사용해서 키와 값을 저장하는 자료구조
- HashSet도 해시 테이블의 주요 원리를 이용한다. HashSet은 Key만 저장하는 특수한 형태의 해시 테이블.