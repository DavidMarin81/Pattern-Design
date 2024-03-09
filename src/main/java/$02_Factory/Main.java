package $02_Factory;

import $02_Factory.factory.CardFactory;

public class Main {
    public static void main(String[] args) {
        CardFactory cardFactory = new CardFactory();

        ICard card1 = cardFactory.createCard("monstruo");
        System.out.println("Tipo de carta: " + card1.cardType());

        ICard card02 = cardFactory.createCard("hechizo");
        System.out.println("Tipo de carta: " + card02.cardType());

    }
}
