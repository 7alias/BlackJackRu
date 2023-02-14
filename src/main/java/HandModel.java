import java.util.ArrayList;
import java.util.List;

// Не стоит наследоваться от Generic типов, вроде List.
// Лучше использовать паттерн "Композиция", как это сделано в DeckModel.
public class HandModel {

    List<CardModel> cardsHand = new ArrayList<>();

    public HandModel() {

    }
    public void addCard(CardModel card) {
        this.cardsHand.add(card);

    }


}

// А разве у функции не указыватся возвращаемый тип в обязательном порядке?
// Разве не должно быть public void addCard(CardModel card)?


// Не стоит наследоваться от Generic типов, вроде List. 
// Лучше использовать паттерн "Композиция", как это сделано в DeckModel.


// А разве у функции не указыватся возвращаемый тип в обязательном порядке?
// Разве не должно быть public void addCard(CardModel card)?

// Всегда оставляй в пустых методах TODO, например:
// TODO: Add card to the hand
// Если нужно сделать несколько вещей - пиши для каждой свой TODO на отдельной строке.
// Еще как защита от дурака, можно дополнительно вызывать throw new NotImplementedException();


// Разве функция не должна вернуть значение?
// Разве не должно быть public int calcPoints()?
    /*
    public int calcPoints() {
        int points = 0;
        for (int i = 0; i < cardList.size(); i++) {
            if (this.cardList.get(i) ==)
                points += cardValue;
        } return points;
    }
*/


// Разве функция не должна вернуть значение?
// Разве не должно быть public int calcPoints()?


// Я думаю splitDeck тут не уместен, так как если игрок засплитил руку - то у него становится 2 полноценные руки.
//public splitDeck(){};



// Я думаю splitDeck тут не уместен, так как если игрок засплитил руку - то у него становится 2 полноценные руки.
//public splitDeck(){}


    /*
    Короче, есть раздача (рука) и есть методы, которые описывают возможные действия с этой рукой.
    это когда можно на двух вальтах например сделать 2 руки
    Либо ты просишь "еще" - это addCard, либо ты считаешь сколько у тебя очков в руке  - calcPoints()
     */

