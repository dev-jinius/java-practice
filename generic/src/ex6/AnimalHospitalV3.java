package ex6;

import animal.Animal;

//제네릭 클래스 + 타입 매개변수 제한
//T의 상한 = Animal => 타입 매개변수로 Animal과 그의 자식들만 가능하다.
//타입 매개변수 제한으로 자바 컴파일러는 타입 값의 범위를 예측 가능하다 => Animal 기능을 모두 사용할 수 있다.
public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    //동물 정보 출력
    public void checkup() {
        System.out.println("동물 크기: " + animal.getSize());
        System.out.println("동물 이름: " + animal.getName());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
