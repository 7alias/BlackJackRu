import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckModel {

    // Не понятно почему именно static, и для чего. Не вижу в этом никакого смысла.
    // Почитай что такое static и зачем он нужен.
    // Нейминг: я бы назвал переменную cardsList - оно идеально описывает что это за переменная.

List<String> cardDeck = new DeckModel();
    // Какая-то пустоватая модель колоды, не кажется?)
    // Колода - это уровень абстракции, поле deckModel у тебя приватное, никто к нему доступ из вне не имеет. И это правильно.
    // Но тогда должны быть методы работы с колодой. Подумай нед тем, какие операции мы можем с колодой совершать.
    // Напиши для начала имя функции без реализации, это называется "декомпозиция".
    // Пример:
    // public void addCard(CardModel card) {
    //    // TODO: Add card to the deck
    // }
    // Придумай все, что можно сделать с колодой и опиши в таком виде.


    public void addCard(CardModel card) {
        //    // TODO: Add card to the deck
        String[] cardSuit = {"♠", "♥", "♦", "♣"};
        String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (int i = 0; i < cardRank.length; i++) {
StringBuilder sb = new StringBuilder();
            for (String rank : cardDeck) {
                for (String suit : cardSuit) {
                    cardDeck.add(sb.toString(new CardModel(rank, suit)));
                }
            }
            Collections.shuffle(cardDeck);
        }
        return cardDeck;

    }

    public void remove() {


        List<CardModel> cardsList;
        public List getCard() {

            return getCard.get(0);
        }

        public void remove () {



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

}

