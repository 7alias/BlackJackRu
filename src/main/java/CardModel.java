public class CardModel {
    private String suit;

    //cardPower = 1- 2 3 4 5 6 7 8 9 10 - 11;
    int cardValue;


    public CardModel(CardModel cardModel) {
        this.suit = cardModel.suit;
        this.cardValue = cardModel.cardValue;


    }
}
