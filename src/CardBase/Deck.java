package CardBase;

import java.util.ArrayList;
import java.util.HashMap;

public class Deck {
    private final Suit[] Suits = Suit.values();
    private final Rank[] Ranks = Rank.values();
    private final int DeckSize = 52;
    private final ArrayList<Card> CardArrayList = new ArrayList<>();
    private int CurrentDeckSize;
    public Deck(int size) {

    }

    public Deck() {

    }

    private void initializeStandardDeck() {
        for(int i = 0; i<Suits.length; i++) {
            for(int j = 0; j<Ranks.length; j++) {
                CardArrayList.add(new Card(Ranks[j], Suits[i]));
            }
        }
    }
}
