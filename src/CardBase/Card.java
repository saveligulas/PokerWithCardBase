package CardBase;

import java.util.concurrent.atomic.AtomicInteger;

public class Card {
    private final Rank Rank;
    private final Suit Suit;
    private final String Name;
    private final int ID;
    private final AtomicInteger HeartsAtomicInteger = new AtomicInteger(100000);
    private final AtomicInteger SpadesAtomicInteger = new AtomicInteger(200000);
    private final AtomicInteger DiamondsAtomicInteger = new AtomicInteger(300000);
    private final AtomicInteger ClubsAtomicInteger = new AtomicInteger(400000);
    public Card(Rank Rank,Suit Suit) {
        this.Rank = Rank;
        this.Suit = Suit;
        Name = Rank.getName(Rank)+" of "+Suit.getSuitName();
        switch(Suit){
            case CLUBS -> ID = ClubsAtomicInteger.getAndIncrement();
            case DIAMONDS -> ID = DiamondsAtomicInteger.getAndIncrement();
            case SPADES -> ID = SpadesAtomicInteger.getAndIncrement();
            case HEARTS -> ID = HeartsAtomicInteger.getAndIncrement();
            default -> ID = 0;
        }
    }

    public String getName() {
        return Name;
    }

    public CardBase.Suit getSuit() {
        return Suit;
    }

    public CardBase.Rank getRank() {
        return Rank;
    }

    public int getID() {
        return ID;
    }
}
