public class HandController {

    public takeCardFromDeck(DeckModel deck) {
        CardModel card = new CardModel(deck.get(0));
        deck.remove(0);
        return card;
    }


}
