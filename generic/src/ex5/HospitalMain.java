package ex5;

import animal.Cat;
import animal.Dog;

//요구사항: 개 병원은 개만 받을 수 있고, 고양이 병원은 고양이만 받을 수 있어야 한다.
//DogHospital, CatHospital 클래스
    //코드 재사용성 X
    //타입 안정성 O
public class HospitalMain {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog1 = new Dog("멍멍이1", 100);
        Cat cat1 = new Cat("야옹이1", 300);
    
        //개 병원
        dogHospital.set(dog1);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat1);
        catHospital.checkup();

        //dogHospital.set(cat1);   //타입 안정성 => 개 병원에 고양이를 입력할 수 없음. (컴파일 오류)
        dogHospital.set(dog1);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);

    }
}
