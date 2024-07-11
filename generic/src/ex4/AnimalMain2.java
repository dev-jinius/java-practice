package ex4;

import animal.Animal;
import animal.Cat;
import animal.Dog;

//Box는 제네릭 클래스
    //T 타입 매개변수가 Animal이라면 set(Animal value) 메서드는 Animal 타입의 하위 타입인 Dog, Cat도 전달할 수 있다.
    //하위 타입인 Dog, Cat은 꺼낼 때는 Animal로 반환된다.
public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
