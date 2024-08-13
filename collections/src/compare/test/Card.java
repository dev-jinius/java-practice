package compare.test;

import java.util.List;

public class Card implements Comparable<Card> {
    private List<String> shapes = List.of("\u2660", "\u2665", "\u2666", "\u2663");
    /*
     "\u2660" : 스페이드(♠)
     "\u2665" : 하트(♥)
     "\u2666" : 다이아몬드(♦)
     "\u2663" : 클로버(♣)
    */
    private String shape;
    private int number;

    public Card(String shape, int number) {
        this.shape = shape;
        this.number = number;
    }

    public String getShape() {
        return shape;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card o) {
        if (this.number != o.number)
            return Integer.compare(this.number, o.number);
        return Integer.compare(shapes.indexOf(this.shape), shapes.indexOf(o.shape));
//        if (this.number < o.number) return -1;
//        if (this.number == o.number) {
//            return shapes.indexOf(this.shape) < shapes.indexOf(o.shape) ? -1 :
//                    ((shapes.indexOf(this.shape) == shapes.indexOf(o.shape)) ? 0 : 1);
//        }
//        return 1;
    }

    @Override
    public String toString() {
        return number + "(" + shape + ")";
    }
}
