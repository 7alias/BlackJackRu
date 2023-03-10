
public class CardModel {
    // private здесь правильно, потому что эти данные не должны меняться из вне.
    // Сама карта знает как с этими данными работать, и никто не должен иметь доступ к оригиналу.
    private String suit;
    private String rank;
    private String card;
    // Соблюдай консистентность при описании полей. В данном случае не хватает private как со suit.
    // Но тогда, если ты делаешь поля private - у тебя должны быть аксесоры к данным, вроде getSuit() и getLabel().
    // Также, я бы назвал это поле private String label, где label - это 2,3,4,5,6,7,8,9,10,J,Q,K,A,
    // потому что число от 1 до 11 не описывает "картинку" карты.
    //cardPower = 1- 2 3 4 5 6 7 8 9 10 - 11;


    public CardModel(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;


        // Не понятно зачем нужен этот конструктор.: убрал
        // С виду - это конструктор копирования, но я не заметил чтобы он где-то вызывался.
        // Зато не хватает нормального конструктора: public CardModel(String suit, String label).
        // В остальном, модель правильная, карта описывается двумя параметрами, ничего лишнего.

        // Соблюдай чистоту кода! Убирай лишние пробелы и пустые строки, самому потом ориентироваться в коде проще будет.


    }

    public CardModel(String card) {
        this.card = card;
    }

    public String getCard() {
        return this.rank + " " + this.suit;
    }
}