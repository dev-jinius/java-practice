package compare.test.refer;

public class Card implements Comparable<Card> {

    private final int rank; //카드의 숫자
    private final Suit suit; //카드의 마크

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        //숫자를 먼저 비교하고, 숫자가 같으면 마크를 비교
        if (this.rank != anotherCard.rank) {
            return Integer.compare(this.rank, anotherCard.rank);
        }
        //Enum의 compareTo(): Enum에 정의한 순서대로 정렬이 된다.
        return this.suit.compareTo(anotherCard.suit);
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
