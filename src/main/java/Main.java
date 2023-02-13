public class Main {


    public static void main(String[] args) {


        GameController gameController = new GameController() {
            @Override
            public void newGame() {

            }

            @Override
            public String newCard(int rank, int suit) {
                return null;
            }

            @Override
            public void newDeck() {

            }

            @Override
            public void takeCard(CardModel card) {

            }
        };
        DeckModel deckModel = new DeckModel();
        deckModel.addCards();

        gameController.newCard(0, 0);

        gameController.newDeck();

        gameController.takeCard(GameController);



    }
}