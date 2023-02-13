import java.util.ArrayList;
import java.util.List;

public interface GameController {
    public void newGame();


    public String newCard(int rank, int suit);


    public void newDeck();

    public void takeCard(CardModel card);
}