package ex5;

import animal.Dog;

//개 전용 병원 클래스
public class DogHospital {
    private Dog animal;
    public void set(Dog animal) {
        this.animal = animal;
    }

    //개 정보 출력
    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    //다른 개와 크기 비교 => 큰 개를 반환
    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
