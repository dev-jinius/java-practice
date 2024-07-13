package ex8;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        //Animal 타입을 포함한 Animal 타입의 상위 타입만 입력받을 수 있다.
        writeBox(objBox);
        writeBox(animalBox);
        //writeBox(dogBox);   //컴파일 오류 (Animal 타입의 자식으로 상위 타입이 아님)
        //writeBox(catBox);   //컴파일 오류 (Animal 타입의 자식으로 상위 타입이 아님)
    }

    //하한 와일드카드 => 매개변수 하한이 Animal 타입
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
