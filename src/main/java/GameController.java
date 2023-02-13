import java.util.ArrayList;
import java.util.List;

public class GameController {



    private static HandModel dealerCards = new HandModel();
    private static HandModel playerCards = new HandModel();
    private static List<DeckModel> deck = new ArrayList<>();
    private static String[] suit;
    String[] cardSuit = {"♠", "♥", "♦", "♣"};
    String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public String newCard(int rank, int suit) {
        CardModel card = new CardModel(cardSuit[suit], cardRank[rank]);

        CardView cardView = new CardView(card);


        System.out.println(cardView.getView(card));
        return cardView.getView(card);
    }


}