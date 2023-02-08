public class CardView {
    //CardView который принимает в конструктор CardModel, и у него должен быть метод.  getView() который вернет строку.
    private static CardModel card;
    private String value;
    private String suit;





        CardView (CardModel model){
            this.card = model;
        }


    public String getView() {
        return value + " " + suit;
    }
}

