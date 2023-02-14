import java.util.ArrayList;
import java.util.List;

/*
1. CardModel
2. DeckModel - List<CardModel>
3. HandModel - List<CardModel>
4. GameModel - DeckModel + List<HandModel>
5. GameView - умеет нарисовать отдельно карту, отдельно руку, отдельно колоду и всё состояние стола
6. GameController - умеет посчитать очки, обработать команду от пользователя, изменить GameModel
 */
public class Game {
    String card;
    private static HandModel dealerCards = new HandModel();
    private static HandModel playerCards = new HandModel();
    private static List<String> deck = new ArrayList<>(52);


    public void newDeck() {
        DeckModel deckModel = new DeckModel();

        deck = deckModel.addCards();
    }

    public String getCard() {
        String card = this.deck.get(0);
        deck.remove(0);
        return card;

    }
}


