package CardBase;

import java.util.Objects;

public record Card(String Name, Rank Rank, Suit Suit) {
    public Card() {
        Objects.requireNonNull(Rank);
        Objects.requireNonNull(Suit);
    }
}
