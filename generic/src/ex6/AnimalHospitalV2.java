package ex6;

import animal.Animal;

//제네릭 클래스 도입
public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    //동물 정보 출력
    public void checkup() {
        //T의 타입을 정의하는 시점에는 타입이 뭔지 알 수 없으므로 Object 기능만 사용할 수 있다.
        //컴파일 오류
        //System.out.println("동물 크기: " + animal.getSize());
        //System.out.println("동물 이름: " + animal.getName());
        //animal.sound();

        animal.toString();
        animal.equals(null);
    }

    public T bigger(T target) {
        //컴파일 오류
        //return animal.getSize() > target.getSize() ? animal : target;

        return null;
    }
}
