import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckModel{

    // Не понятно почему именно static, и для чего. Не вижу в этом никакого смысла.
    // Почитай что такое static и зачем он нужен.
    // Нейминг: я бы назвал переменную cardsList - оно идеально описывает что это за переменная.

    List<String> cardList = new ArrayList<>(52);
    String[] cardSuit = {"♠", "♥", "♦", "♣"};
    String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Какая-то пустоватая модель колоды, не кажется?)
    // Колода - это уровень абстракции, поле deckModel у тебя приватное, никто к нему доступ из вне не имеет. И это правильно.
    // Но тогда должны быть методы работы с колодой. Подумай над тем, какие операции мы можем с колодой совершать.
    // Напиши для начала имя функции без реализации, это называется "декомпозиция".
    // Пример:
    // public void addCard(CardModel card) {
    //    // TODO: Add card to the deck
    // }
    // Придумай все, что можно сделать с колодой и опиши в таком виде.
    public String newCard(int rank, int suit) {
        CardModel card = new CardModel(cardSuit[suit], cardRank[rank]);
        return card.getCard();

    }

    public List<String> addCards() {
        //    TODO: Add cards to the deck
        DeckModel deckModel = new DeckModel();
        for (int i = 0; i <= 12; i++) {
            for (int j = 0; j <= 3; j++) {
                cardList.add(deckModel.newCard(i, j));
            }
            Collections.shuffle(cardList);
        }return cardList;

    }

    public void remove() {
        cardList.remove(0);
    }


}



