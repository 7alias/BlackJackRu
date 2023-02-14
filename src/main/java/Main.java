public class Main {


    public static void main(String[] args) {
        Game game = new Game();
        game.newDeck();
        GameView gameView = new GameView();
        gameView.getView(game.getCard());


        while (true) {
            try {
                for (int i = 0; i < 13; i++) {
                    System.out.print("|" + game.getCard());
                }
                System.out.println();


            } catch (Exception e) {
                System.out.println("Карты закончились");
                break;
            }
        }
    }
}