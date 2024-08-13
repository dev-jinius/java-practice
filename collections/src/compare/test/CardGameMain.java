package compare.test;

//요구사항
    //카드(Card)는 1~13까지 있다. 각 번호당 다음 4개의 문양이 있다.
        //♠: 스페이드
        //♥: 하트
        //◆: 다이아
        //♣: 클로버
    //예) 1(♠), 1(♥), 1(◆), 1(♣), 2(♠), 2(♥), 2(g), 2(♣) ... 13(♠), 13(♥), 13(◆), 13(♣)
    //따라서 13 * 4 = 총 52장의 카드가 있다.
    // 52장의 카드가 있는 카드 뭉치를 덱(Deck)이라 한다.
    //2명의 플레이어(Player)가 게임을 진행한다.
    //게임을 시작하면 다음 순서를 따른다.
    /*
        1. 덱에 있는 카드를 랜덤하게 섞는다.
        2. 각 플레이어는 덱에서 카드를 5장씩 뽑는다.
        3. 각 플레이어는 5장의 카드를 정렬된 순서대로 보여준다. 정렬 기준은 다음과 같다.
        작은 숫자가 먼저 나온다.
        같은 숫자의 경우 ♠, ♥, ◆, ♣ 순으로 정렬한다. ♠가 가장 먼저 나온다.
        예) 1(♠), 1(♥), 2(◆), 3(♣) 순서로 출력된다.
         4. 카드 숫자의 합계가 큰 플레이어가 승리한다.
        게임을 단순화 하기 위해 숫자만 출력한다.
        합계가 같으면 무승부이다
     */
//실행 결과 예시
    /*
        플레이어1의 카드: [2(♠), 7(♥), 7(♦), 8(♣), 13(♠)], 합계: 37
        플레이어2의 카드: [1(♠), 1(♣), 6(♠), 9(♠), 9(♣)], 합계: 26
        플레이어1 승리
     */
    /*
        플레이어1의 카드: [2(♦), 3(♠), 6(♥), 10(♣), 13(♦)], 합계: 34
        플레이어2의 카드: [2(♠), 4(♣), 5(♠), 11(♣), 12(♥)], 합계: 34
        무승부
     */
//참고
    //스페이드, 하트 같은 아이콘을 직접 사용하기 어려운 경우 다음과 같이 `\` 와 함께 다음 코드를 적어주면 아이콘을 출력할 수 있다.
    /*
         "\u2660" : 스페이드(♠)
         "\u2665" : 하트(♥)
         "\u2666" : 다이아몬드(♦)
         "\u2663" : 클로버(♣)
     */
public class CardGameMain {
    public static void main(String[] args) {
        // 코드 작성
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");
        Deck deck = new Deck();

        System.out.println("게임 시작");
        deck.shuffle(deck);
        player1.selectCards(deck);
        player2.selectCards(deck);
        matchResult(player1, player2);
    }

    private static void matchResult(Player p1, Player p2) {
        if (p1.getScore() == p2.getScore()) {
            System.out.println("무승부");
            return;
        }
        if (p1.getScore() > p2.getScore()) {
            System.out.println("플레이어1 승리");
            return;
        }
        System.out.println("플레이어2 승리");
    }
}
