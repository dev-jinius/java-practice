package ex9;

public class UnitUtil {

    public static <T extends BioUnit> T maxHP(T t1, T t2) {
        return t1.getHp() >= t2.getHp() ? t1 : t2;
    }
}
