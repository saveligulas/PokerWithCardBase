package CardBase;

public enum Suit {
    HEARTS("Hearts"),SPADES("Spades"),DIAMONDS("Diamonds"),CLUBS("Clubs");
    private final String suitName;
    private Suit(String suitName){
        this.suitName = suitName;
    }
    public String getSuitName() {
        return suitName;
    }
}
