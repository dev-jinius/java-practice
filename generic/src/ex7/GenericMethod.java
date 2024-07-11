package ex7;

public class GenericMethod {
    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }
    public static <T> T genericMethod(T t) {
        System.out.println("Generic print: " + t);
        return t;
    }
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("Number print: " + t);
        return t;
    }
    public <T> T noStaticGenericMethod(T t) {
        System.out.println("static 없는 메서드도 가능");
        return t;
    }
}
