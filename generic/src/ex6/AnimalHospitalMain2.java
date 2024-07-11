package ex6;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class AnimalHospitalMain2 {
    public static void main(String[] args) {
        //제네릭 클래스에 어떤 타입이든 넣을 수 있다. 개/고양이/Integer/Object 등등
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Animal> animalHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}
