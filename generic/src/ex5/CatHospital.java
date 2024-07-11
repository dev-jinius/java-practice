package ex5;

import animal.Cat;

//고양이 전용 병원 클래스
public class CatHospital {
    private Cat animal;
    public void set(Cat animal) {
        this.animal = animal;
    }

    //고양이 정보 출력
    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    //다른 고양이와 크기 비교 => 큰 고양이를 반환
    public Cat bigger(Cat target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
