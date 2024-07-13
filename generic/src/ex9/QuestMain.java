package ex9;

public class QuestMain {
    public static void main(String[] args) {
        //요구사항 1. UnitUtil 클래스에 maxHp() 메서드를 만들어라.
        // - UnitUtil.maxHp()는 두 유닛을 입력받아 체력이 높은 유닛을 반환한다. (체력이 같은 경우 아무나 반환 가능)
        // - 제네릭 메서드를 사용해야 한다.
        // - 입력하는 유닛의 타입과 반환하는 유닛의 타입이 같아야 한다.
        Marine m1 = new Marine("마린1", 40);
        Marine m2 = new Marine("마린2", 50);
        Zealot z1 = new Zealot("질럿1", 100);
        Zealot z2 = new Zealot("질럿2", 70);
        Zergling zg1 = new Zergling("저글링1", 12);
        Zergling zg2 = new Zergling("저글링2", 77);

        Marine marine = UnitUtil.maxHP(m1, m2);
        System.out.println("marine = " + marine);
        Zealot zealot = UnitUtil.maxHP(z1, z2);
        System.out.println("zealot = " + zealot);

        //요구사항 2. Shuttle 클래스를 만들어라
        // - 제네릭 타입을 사용해야 한다.
        // - showInfo() 메서드를 통해 탑승한 유닛의 정보를 출력한다.
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(m2);
        shuttle1.showInfo();

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(zg2);
        shuttle2.showInfo();

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(z1);
        shuttle3.showInfo();

        //요구사항 3. UnitPrinter 클래스를 만들어라
        // - UnitPrinter.printV1() 메서드는 제네릭 메서드로 구현해야 한다.
        // - UnitPrinter.printV1() 메서드는 와일드카드로 구현해야 한다.
        // - 이 두 메서드는 셔틀에 들어있는 유닛의 정보를 출력한다.
        UnitPrinter.printV1(shuttle1);
        UnitPrinter.printV2(shuttle2);
    }
}
