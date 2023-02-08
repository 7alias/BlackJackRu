import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static HandModel dealerCards = new HandModel();
    private static HandModel playerCards = new HandModel();
    private static List<DeckModel> deck = new ArrayList<>();
    private static String[] suit;




    public static void main(String[] args) {
        for (CardModel cardValue : playerCards) {
            for (String suit : suit) {
                deck.add(new CardModel(suit, cardValue));
            }
        }
        Collections.shuffle(deck);




    }
    takeCardFromDeck();
}