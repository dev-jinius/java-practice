package ex1;

//IntegerBox => 숫자를 보관하고 꺼낼 수 있는 기능 제공
//StringBox => 문자열을 보관하고 꺼낼 수 있는 기능 제공
//타입마다 Box 클래스를 만들고, 같은 패턴으로 기능을 보관하고 꺼낸다. => 중복 문제 발생
public class BoxMain {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); //오토 박싱
        int i = integerBox.get();
        System.out.println("Integer = " + i);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("String = " + str);
    }
}
