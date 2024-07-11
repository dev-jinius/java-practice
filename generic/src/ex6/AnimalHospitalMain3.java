package ex6;

import animal.Cat;
import animal.Dog;

//요구사항: 개나 고양이 타입만 받을 수 있도록 하자.
public class AnimalHospitalMain3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();
        //요구사항 만족 => Animal 타입이나 자식 타입만 넣을 수 있다. (타입 안정성 O)
        //AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3(); //컴파일 오류

        Dog dog1 = new Dog("멍멍이1", 100);
        Cat cat1 = new Cat("야옹이1", 300);

        //개 병원
        dogHospital.set(dog1);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat1);
        catHospital.checkup();

        //타입 안정성 문제 해결 => 개 병원에 고양이가 입력될 수 없다.
        //뜻하지 않은 오류가 발생할 수 없다 => 애초에 개 병원에 고양이, 고양이 병원에 개를 넣을 수 없기 때문.
        //dogHospital.set(cat1); //컴파일 오류 발생
        
        //Animal 또는 자식 클래스 타입으로 반환할 수 있다 => 다운캐스팅 필요X
        dogHospital.set(dog1);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
