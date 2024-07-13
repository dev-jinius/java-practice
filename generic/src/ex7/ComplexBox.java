package ex7;

import animal.Animal;

public class ComplexBox <T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.className: " + animal.getClass());
        return z;
    }

    //제네릭 메서드가 제네릭 타입보다 높은 우선순위.
    public <T> T printAndReturn2(T t) {
        //T t는 제네릭 클래스의 제네릭 타입(T extends Animal)과는 다른 타입이다.
        //t.getName();  // t는 Animal 타입 제한이 없으므로 Animal의 메서드를 사용할 수 없다.
        System.out.println("t.className: " + t.getClass());
        return t;
    }
}
