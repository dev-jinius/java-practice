package ex2;

//ObjectBox => Object를 보관하고 꺼낼 수 있는 기능 제공 => 다형성을 통한 중복 문제 해결
//ObjectBox의 문제
    //1. get() 메서드의 반환타입이 Object이기 때문에 캐스팅을 해야 한다.
    //2. 어느 타입이든 넣을 수 있어서 의도와 다른 타입의 데이터를 입력할 수 있다. => 타입 안정성 문제 발생
public class ObjectMain {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("Hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달
        integerBox.set("world");    //Integer 타입에 String 타입 인수 전달
        Integer result = (Integer) integerBox.get();    //ClassCastException 발생
        System.out.println("result = " + result);
    }
}
