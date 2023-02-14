import java.util.ArrayList;
import java.util.List;

public class GameView {
   List<String> cardsList = new ArrayList<>();

    public GameView() {
    }

    public void doSomething(ArrayList<String> myList) {
            // do something with "myList"
        }
    List<String> cards;

    //CardView который принимает в конструктор CardModel, и у него должен быть метод.  getView() который вернет строку.


    public void setCardsList(List<String> cardsList) {
        this.cardsList = cardsList;
    }


    public String getView(String card) {
cardsList.add(card);
        return this.cardsList.get(0);
    }


}
