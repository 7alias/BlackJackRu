import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        GameController gameController = new GameController();


        gameController.newCard(0,0);
        DeckModel deckModel = new DeckModel();
        deckModel.addCards();
        //deckModel.getCard(0);

        /*for (CardModel cardValue : playerCards) {
            for (String suit : suit) {
                deck.add(card);
            }
        }
        Collections.shuffle(deck);




    }
    abstract void takeCardFromDeck();
    */
    }
}