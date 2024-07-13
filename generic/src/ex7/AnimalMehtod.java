package ex7;

import animal.Animal;

public class AnimalMehtod {
    //제네릭 메서드
    public static <T extends Animal> void checkup(T t) {
        System.out.println("동물 크기: " + t.getSize());
        System.out.println("동물 이름: " + t.getName());
        t.sound();
    }
    //제네릭 메서드
    public static <T extends Animal> T bigger(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
