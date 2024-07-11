package ex6;

import animal.Animal;
import animal.Cat;
import animal.Dog;

//DogHospital, CatHospital 대신 AnimalHospitalV1 클래스로 다형성 시도
    // 코드 재사용성 O => AnimalHospitalV1 클래스 하나로 개와 고양이를 모두 처리할 수 있다.
    // 타입 안정성 X => 개 병원에 고양이를, 고양이 병원에 개를 전달할 수 있다.
    // 다운 캐스팅 필요 => Animal 타입을 반환하기 때문에 Dog/Cat으로 타입을 변환해야 한다.
    // 개발자 실수 가능 => 실수로 고양이를 입력했는데, 개를 반환하는 상황이라면 캐스팅 예외 발생
public class AnimalHospitalMain {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog1 = new Dog("멍멍이1", 100);
        Cat cat1 = new Cat("야옹이1", 300);

        //개 병원
        dogHospital.set(dog1);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat1);
        catHospital.checkup();

        //타입 안정성 문제 발생 => 개 병원에 고양이가 입력될 수 있다.
        dogHospital.set(cat1);  //매개변수 체크 실패: 컴파일 오류가 발생하지 않는다.
        
        //다운캐스팅 필요
        dogHospital.set(dog1);
        Animal animal = dogHospital.bigger(new Dog("멍멍이2", 200));
        Dog biggerDog = (Dog) animal;   //개 타입으로 변환 필요
        System.out.println("biggerDog = " + biggerDog);

        //뜻하지 않은 오류 발생
//        dogHospital.set(cat1);
//        Animal animal1 = dogHospital.bigger(new Dog("멍멍이3", 50));
//        Dog biggerDog1 = (Dog) animal1; //animal1에 고양이 타입이 반환되면서 Dog 타입 캐스팅 에러가 발생한다.
//        System.out.println("biggerDog1 = " + biggerDog1);
    }
}
