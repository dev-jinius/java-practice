package ex8;

//Java가 제네릭 도입할 때, 최대한 레거시 코드와 호환되게 하려고 Eraser를 만들었다.
//컴파일 시점에는 제네릭을 허용하지만, 런타임 시점에는 하위 호환으로 제네릭 타입을 다 제거한다.
public class EraserBox<T> {
    //Eraser => 런타임(실행 시점)에 다 Object로 바뀐다.
    //타입이 다 날라가고 Object가 되어서 개발자 의도와 달라지므로 new, instanceof를 허용하지 않는다.
        //instanceof 는 항상 Object와 비교하게 된다. => 항상 참이 됨.
        //new T() 는 항상 new Object()가 된다.

    public boolean instanceCheck(Object param) {
        //return param instanceof T;  //컴파일 오류
        return false;
    }

    public void create() {
        //return new T();  //컴파일 오류
    }
}
