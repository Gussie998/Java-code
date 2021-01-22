package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * User:DELL
 * Date:2021-01-22
 * Time:9:03
 */

//扑克牌
class Card{
    public String suit;
    public int rank;

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "[" + suit +
                "," + rank +
                ']';
    }
}

class DeckCard{
    public  static final String[] suits={"❤","♣","♦","♠"};

    public List<Card> buyCard() {
        List<Card> cardList = new ArrayList<>();

        for (int i = 0; i <4 ; i++) {
            for (int j = 1; j <=13 ; j++) {
                String suit = suits[i];
                int rank = j;
                Card card = new Card(suit,rank);
                cardList.add(card);
            }
        }
        return cardList;
    }

    public  void swap(List<Card> cardList,int i,int j) {
        Card tmp = cardList.get(i);
        cardList.set(i,cardList.get(j));
        cardList.set(j,tmp);
    }

    public void washCard(List<Card> cardList){
        for (int i = cardList.size()-1; i >0 ; i--) {
            Random random = new Random();
            int rand =random.nextInt(i);
            swap(cardList,i,rand);
        }
    }

}

public class TestDemo {
    public static void main(String[] args) {
        DeckCard deckCard = new DeckCard();
        List<Card> cardList=deckCard.buyCard();
        System.out.println("xipai");
        deckCard.washCard(cardList);
        System.out.println(cardList);

        System.out.println("fapai");

        List<List<Card>> players = new ArrayList<>();
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();

        players.add(player1);
        players.add(player2);
        players.add(player3);

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <3 ; j++) {
                Card card = cardList.remove(0);
                players.get(j).add(cardList.remove(0));
            }
        }
        System.out.print("player1:");
        System.out.println(players.get(0));
        System.out.print("player2:");
        System.out.println(players.get(1));
        System.out.print("player3:");
        System.out.println(players.get(2));
        System.out.print("剩余的牌");
        System.out.println(cardList);

    }
}
