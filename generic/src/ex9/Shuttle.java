package ex9;

public class Shuttle<T extends BioUnit>{
    private T unit;

    public void in(T t) {
        this.unit = t;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println("[유닛 정보] 이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
