package ex7;

public class MethodMain {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
        Integer integer = (Integer) GenericMethod.objMethod(i); //캐스팅 하기 싫..

        //타입 인자(Type Argument) 명시적 전달 => 메서드 호출 시점에 타입 인자를 전달한다.
        System.out.println("=== 타입 인자 명시적 전달 ===");
        Integer genericValue = GenericMethod.<Integer>genericMethod(i);
        Integer numberValue = GenericMethod.<Integer>numberMethod(i);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        //제네릭 메서드 타입 추론
        System.out.println("=== 제네릭 메서드 타입 추론 ===");
        Integer genericValue2 = GenericMethod.genericMethod(i);
        Integer numberValue2 = GenericMethod.numberMethod(i);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
    }
}
