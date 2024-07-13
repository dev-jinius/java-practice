package ex9;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        BioUnit unit = shuttle.out();
        System.out.println("[셔틀 유닛] 이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit unit = shuttle.out();
        System.out.println("[셔틀 유닛] 이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

}
