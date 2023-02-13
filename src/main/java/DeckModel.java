import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckModel {

    // Не понятно почему именно static, и для чего. Не вижу в этом никакого смысла.
    // Почитай что такое static и зачем он нужен.
    // Нейминг: я бы назвал переменную cardsList - оно идеально описывает что это за переменная.

    List<String> cardList = new ArrayList<>(52);

    // Какая-то пустоватая модель колоды, не кажется?)
    // Колода - это уровень абстракции, поле deckModel у тебя приватное, никто к нему доступ из вне не имеет. И это правильно.
    // Но тогда должны быть методы работы с колодой. Подумай над тем, какие операции мы можем с колодой совершать.
    // Напиши для начала имя функции без реализации, это называется "декомпозиция".
    // Пример:
    // public void addCard(CardModel card) {
    //    // TODO: Add card to the deck
    // }
    // Придумай все, что можно сделать с колодой и опиши в таком виде.


    public void addCards(CardModel card) {
        //    // TODO: Add card to the deck

        for (int i = 0; i < cardList.size(); i++) {

            for (String rank : cardList) {

                cardList.add(card.getCard());
            }
        }
        Collections.shuffle(cardList);
    }


    public void remove() {
        cardList.remove(0);
    }

    public String getCard() {

        return this.cardList.get(0);
    }


}





            // Какая-то пустоваятая модель колоды, не кажется?)
            // Колода - это уровень абстрации, поле deckModel у тебя приватное, никто к нему доступ из вне не имеет. И это правильно.
            // Но тогда должны быть методы работы с колодой. Подумай нед тем, какие опреации мы можем с колодой совершать.
            // Напиши для начала имя функции без реализации, это называется "декомпозиция".
            // Пример:
            // public void addCard(CardModel card) {
            //    // TODO: Add card to the deck
            // }
            // Придумай все, что можно сделать с колодой и опиши в таком виде.



