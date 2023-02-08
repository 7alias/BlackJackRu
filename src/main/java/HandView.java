import java.util.ArrayList;
import java.util.List;

public class HandView {


    public String getView() {
        StringBuilder sb = new StringBuilder();
        for (CardModel card : cardList) {
            sb.append(cardView.getView()).append("\n");
        }
        return sb.toString();
    }
}