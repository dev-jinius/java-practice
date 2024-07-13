package ex8;

import animal.Animal;
import animal.Cat;
import animal.Dog;

//일반적으로 제네릭 메서드의 기능을 와일드카드가 모두 할 수 있다. => 제네릭 메서드가 꼭 필요한 상황이 아니면 와일드카드 사용 권장.
//But 제네릭 메서드를 꼭 사용해야 하는 경우가 있다.
    //- 반환 타입을 전달한 타입(원하는 타입)으로 반환해야 하는 경우
    //- 와일드카드는 제네릭을 정의할 때 사용하는 것이 아님. 따라서 이미 정해진 타입으로 반환됨.
    //- 와일드카드 용도는 이미 정의된 제네릭을 활용하는 경우
public class WildcardMain {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));
        catBox.set(new Cat("냐옹이", 200));
        
        //제네릭 메서드 사용
        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printGenericV2(dogBox);
        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
        Cat cat = WildCardEx.printAndReturnGeneric(catBox);

        //와일드카드 사용
        WildCardEx.printWildcardV1(dogBox);
        WildCardEx.printWildcardV2(dogBox);
        Animal animal = WildCardEx.printAndReturnWildcard(dogBox);
    }
}
