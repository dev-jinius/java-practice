package compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> cardList = new ArrayList<>();

    private String name;

    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void selectCards(Deck deck) {
        for (int i = 0; i < 5; i++) {
            Card card = deck.removeCard(deck);
            this.cardList.add(card);
            this.score += card.getNumber();
        }
        showCards();
    }

    private void showCards() {
        this.cardList.sort(null);
        System.out.println(this.name + "의 카드: " + this.cardList + ", 합계: " + this.score);
    }
}
