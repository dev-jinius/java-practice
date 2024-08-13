package compare.test;

import java.util.*;

public class Deck {
    private List<Card> cardList;

    public Deck() {
        createDeck();
    }

    public List<Card> getCardList() {
        return cardList;
    }

    //덱 생성
    private void createDeck() {
        this.cardList = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            this.cardList.add(new Card("\u2660", i+1));
            this.cardList.add(new Card("\u2665", i+1));
            this.cardList.add(new Card("\u2666", i+1));
            this.cardList.add(new Card("\u2663", i+1));
        }
    }

    //덱에 있는 카드 섞기
    public void shuffle(Deck deck) {
        System.out.println("카드를 섞겠습니다.");
        Collections.shuffle(deck.getCardList());
    }
    
    //덱에서 맨 앞 카드 뽑기
    public Card removeCard(Deck deck) {
        return cardList.remove(0);
    }
}
