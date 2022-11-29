import CardBase.Card;
import CardBase.Deck;
import CardBase.Rank;
import CardBase.Suit;

public class Main {
    public static void main(String[] args) {
        Card card = new Card(Rank.ACE, Suit.CLUBS);
        System.out.println(card.getName());
        Deck deck = new Deck(100);
        deck.printCards();
    }
}