import java.util.ArrayList;
import java.util.List;

//抽象出一张牌
class Card {
    private String suit;//花色
    private int rank;//牌面值

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "card{" +
                "suit='" + suit + '\'' +
                ", rank=" + rank +
                '}';
    }
}

class CardDemo {
    public String[] suits = {"♥","♠","◇","♣"};
    List<Card> cards = new ArrayList<>();

    public List<Card> buyDeck() {
        //控制花色
        for (int i = 0; i < 4; i++) {
            //控制个数
            for (int j = 1; j <= 13; j++) {
                String suit = suits[i];
                int rank = j;
                Card card = new Card(suit,rank);
                cards.add(card);
            }
        }
        return cards;
    }

}

public class TestDemo1 {
    public static void main(String[] args) {
        CardDemo cardDemo = new CardDemo();
        cardDemo.buyDeck();
        System.out.println(cardDemo.cards);
        System.out.println("========shuffer=======");
    }
}
