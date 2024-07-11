package ex3;

//제네릭 클래스 : 자바 컴파일러가 입력한 타입 정보를 기반으로 이런 코드가 있다고 가정하고, 컴파일 과정에서 타입 정보를 반영한다.
//GenericBox => 원하는 모든 타입 사용 가능 => 코드 재사용성과 타입 안정성 모두 해결
//타입추론 : 생성하는 제네릭 타입을 생략할 수 있다 e.g. GenericBox<Integer> integerGenericBox = new GenericBox<>();
public class GenericMain {
    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>(); //생성 시점에 T의 타입 결정
        integerGenericBox.set(100);
        //integerGenericBox.set("100");  //문자열 타입 => 컴파일 오류
        Integer integer = integerGenericBox.get();  //Integer 타입 반환. 캐스팅 필요X
        System.out.println("Integer = " + integer);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("hi");
        //stringGenericBox.set(100);    //Integer 타입 => 컴파일 오류
        String str = stringGenericBox.get();
        System.out.println("String = " + str);
        
    }
}
