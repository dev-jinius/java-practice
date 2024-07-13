package ex7;

import animal.Cat;
import animal.Dog;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMehtod.checkup(dog);  //타입 추론으로 AnimalMehtod.<Dog>checkup(dog);에서 <Dog> 생략 가능
        AnimalMehtod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMehtod.bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);

    }
}
